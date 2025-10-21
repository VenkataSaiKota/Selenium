package Cognizant.JavaPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Mini {
	@Test
    public static void ex() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            driver.manage().window().maximize();

            // 1) Login
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
            // Page scaffold loaded
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.oxd-layout")));

            // 2) Navigate: Admin -> Job -> Job Categories (stable locators)
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Admin']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Job']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Job Categories']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.oxd-table-body")));

            // 3) Add "Test Engineer" (save if not duplicate; cancel if duplicate appears)
            final String categoryName = "Test Engineer";
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();

            WebElement jobCategoryInput = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//label[normalize-space()='Name']/following::input[1]")
                    )
            );
            jobCategoryInput.clear();
            jobCategoryInput.sendKeys(categoryName);

            // Click Save first, then detect duplicate error (safer than inverse invisibility check)
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save']"))).click();

            boolean duplicateVisible = false;
            try {
                // short wait only for the inline "Already exists" message
                new WebDriverWait(driver, Duration.ofSeconds(2))
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//span[text()='Already exists']")
                        ));
                duplicateVisible = true;
            } catch (TimeoutException ignore) {
                duplicateVisible = false;
            }

            if (duplicateVisible) {
                // If duplicate => Cancel out of the form
                wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Cancel']"))).click();
            } else {
                // If created successfully => (optional) wait for Success toast
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[contains(@class,'oxd-toast')][.//p[contains(.,'Success') or contains(.,'Successfully')]]")
                    ));
                } catch (TimeoutException ignore) {
                    // toast might not always appear—ignore
                }
            }

            // 4) Delete all "Test Engineer" categories via checkbox + Delete Selected
         // 4) Delete all "Test Engineer" categories via checkbox + Delete Selected
         // 4) Delete all "Test Engineer" categories via checkbox + Delete Selected (robust)
            By rowByName = By.xpath(
                "//div[contains(@class,'oxd-table-body')]//div[contains(@class,'oxd-table-card') and .//div[normalize-space()='Test Engineer']]"
            );

            // Ensure we are back on the table
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.oxd-table-body")));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            int deleted = 0;

            while (true) {
                List<WebElement> rows = driver.findElements(rowByName);
                if (rows == null || rows.isEmpty()) {
                    System.out.println("No more 'Test Engineer' rows to delete.");
                    break;
                }

                WebElement row = rows.get(0);

                // 1) Try to select the row's checkbox
                // Prefer the <input type="checkbox"> if present; otherwise use the label
                WebElement checkboxInput = null;
                try {
                    checkboxInput = row.findElement(By.xpath(".//div[@role='cell'][1]//input[@type='checkbox']"));
                } catch (NoSuchElementException ignore) {}

                if (checkboxInput != null) {
                    // Scroll into view and click via JS (hidden inputs sometimes need JS click)
                    js.executeScript("arguments[0].scrollIntoView({block:'center'});", checkboxInput);
                    js.executeScript("arguments[0].click();", checkboxInput);

                    // Wait until it is selected
                    boolean selected = false;
                    long start = System.currentTimeMillis();
                    while (System.currentTimeMillis() - start < 2000) {
                        String checked = checkboxInput.getAttribute("checked");
                        if (checked != null && (checked.equals("true") || checked.equals("checked"))) {
                            selected = true;
                            break;
                        }
                        try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                    }

                    if (!selected) {
                        // Fallback: click label if input didn't toggle
                        try {
                            WebElement checkboxLabel = row.findElement(By.xpath(".//div[@role='cell'][1]//label"));
                            wait.until(ExpectedConditions.elementToBeClickable(checkboxLabel)).click();
                        } catch (Exception e) {
                            System.out.println("Could not select checkbox: " + e.getMessage());
                        }
                    }
                } else {
                    // No input found; try label
                    WebElement checkboxLabel = row.findElement(By.xpath(".//div[@role='cell'][1]//label"));
                    js.executeScript("arguments[0].scrollIntoView({block:'center'});", checkboxLabel);
                    wait.until(ExpectedConditions.elementToBeClickable(checkboxLabel)).click();
                }

                // 2) Click "Delete Selected" when it becomes enabled
                By deleteSelectedBtnBy = By.xpath("//button[normalize-space()='Delete Selected']");
                WebElement deleteSelectedBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteSelectedBtnBy));

                // Ensure it's enabled (not disabled)
                boolean enabled = false;
                long start = System.currentTimeMillis();
                while (System.currentTimeMillis() - start < 3000) {
                    String disabledAttr = deleteSelectedBtn.getAttribute("disabled");
                    if (disabledAttr == null) { // enabled
                        enabled = true;
                        break;
                    }
                    try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                }

                if (!enabled) {
                    // Fallback: use per-row trash icon if bulk button is still disabled
                    System.out.println("'Delete Selected' is disabled. Falling back to per-row trash icon.");
                    try {
                        WebElement trash = row.findElement(By.xpath(".//i[contains(@class,'bi-trash')]"));
                        wait.until(ExpectedConditions.elementToBeClickable(trash)).click();

                        WebElement yesDelete = wait.until(ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[normalize-space()='Yes, Delete']")));
                        yesDelete.click();

                        wait.until(ExpectedConditions.stalenessOf(row));
                        deleted++;
                        // Optional toast
                        try {
                            wait.until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//div[contains(@class,'oxd-toast')][.//p[contains(.,'Success') or contains(.,'Successfully')]]")
                            ));
                        } catch (TimeoutException ignore) {}
                        continue; // go to next iteration
                    } catch (Exception fallbackEx) {
                        throw new RuntimeException("Could not delete via bulk or trash icon: " + fallbackEx.getMessage(), fallbackEx);
                    }
                }

                // We have an enabled Delete Selected button
                wait.until(ExpectedConditions.elementToBeClickable(deleteSelectedBtn)).click();

                // 3) Confirm "Yes, Delete"
                WebElement yesDelete = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Yes, Delete']")));
                yesDelete.click();

                // 4) Wait until the specific row is removed from the DOM
                wait.until(ExpectedConditions.stalenessOf(row));

                // Optional: toast confirmation
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'oxd-toast')][.//p[contains(.,'Success') or contains(.,'Successfully')]]")
                    ));
                } catch (TimeoutException ignore) {}

                deleted++;
                System.out.println("Deleted one 'Test Engineer' row. Count so far: " + deleted);
            }

            System.out.println("Total 'Test Engineer' rows deleted: " + deleted);

            // Final verification
            boolean stillPresent = !driver.findElements(rowByName).isEmpty();
            System.out.println("'Test Engineer' present after deletion? " + stillPresent);
//            int deleted = 0;
//            while (true) {
//                List<WebElement> rows = driver.findElements(rowByName);
//                if (rows == null || rows.isEmpty()) break;
//
//                WebElement row = rows.get(0);
//
//                // Click row checkbox (first cell)
//                WebElement checkboxLabel = row.findElement(By.xpath(".//div[@role='cell'][1]//label"));
//                wait.until(ExpectedConditions.elementToBeClickable(checkboxLabel)).click();
//
//                // Click Delete Selected
//                WebElement deleteSelectedBtn = wait.until(ExpectedConditions.elementToBeClickable(
//                        By.xpath("//button[normalize-space()='Delete Selected']")));
//                deleteSelectedBtn.click();
//
//                // Confirm in modal
//                WebElement yesDelete = wait.until(ExpectedConditions.elementToBeClickable(
//                        By.xpath("//button[normalize-space()='Yes, Delete']")));
//                yesDelete.click();
//
//                // Wait that exact row is gone
//                wait.until(ExpectedConditions.stalenessOf(row));
//
//                // Optional: success toast
//                try {
//                    wait.until(ExpectedConditions.visibilityOfElementLocated(
//                            By.xpath("//div[contains(@class,'oxd-toast')][.//p[contains(.,'Success') or contains(.,'Successfully')]]")
//                    ));
//                } catch (TimeoutException ignore) { }
//
//                deleted++;
//            }
//
//            System.out.println("Deleted '" + categoryName + "' rows: " + deleted);
//
//            // 5) (Optional) Read table rows into a list of strings (no streams) if you still need it
//            List<WebElement> jobCatElements = wait.until(
//                    ExpectedConditions.presenceOfAllElementsLocatedBy(
//                            By.xpath("//div[contains(@class,'oxd-table-body')]//div[contains(@class,'oxd-table-card')]")
//                    )
//            );
//            List<String> valList = new ArrayList<String>();
//            for (int i = 0; i < jobCatElements.size(); i++) {
//                String txt = jobCatElements.get(i).getText();
//                if (txt != null) {
//                    txt = txt.trim();
//                    if (!txt.isEmpty()) {
//                        valList.add(txt);
//                    }
//                }
//            }
//            System.out.println("Remaining rows count: " + valList.size());
//
        }
                finally {
           
       }
        Thread.sleep(3000);
        
        WebElement organization = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")));
        organization.click();
        organization.getAttribute("value");
 
        WebElement locations = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Locations')]")));
        locations.click();
 
        Thread.sleep(2000);
 
        WebElement addLocation = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        addLocation.click();
 
        WebElement locationName = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
        locationName.sendKeys("karimnagar");
 
        Thread.sleep(1000);
 
        List<WebElement> locationErrors = driver.findElements(
            By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
 
        if (!locationErrors.isEmpty()) {
            System.out.println("Hyderabad already exists. Cancelling addition.");
            WebElement cancelLocation = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")));
            cancelLocation.click();
        } else {
            WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='oxd-select-text-input']")));
            countryDropdown.click();
 
            List<WebElement> countryOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[@role='listbox']//div[@class='oxd-select-option']")));
 
            for (WebElement option : countryOptions) {
                if (option.getText().trim().equalsIgnoreCase("India")) {
                    option.click();
                    break;
                }
            }
 
            WebElement saveLocation = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));
            saveLocation.click();
            Thread.sleep(2000);
        }
 
        WebElement locationCheckbox = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("(//div[@class='oxd-checkbox-wrapper']/label)[1]")));
        locationCheckbox.click();
 
        WebElement deleteLocation = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")));
        deleteLocation.click();
 
        WebElement confirmDeleteLocation = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")));
        confirmDeleteLocation.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"))).sendKeys("Test Demo");
      
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"))).sendKeys("Test Demo");
        WebElement skillElement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[19]/div/div[4]/div/button[1]")));
        skillElement.click();
        
        //List<WebElement>skills=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[19]/div/div[4]/div/button[1]"))).click();
        Thread.sleep(2000);
        driver.quit();
    

	}
	}
