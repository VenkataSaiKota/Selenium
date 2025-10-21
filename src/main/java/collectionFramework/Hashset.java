package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Set<String> company_names = new HashSet<>();

       
        company_names.add("GOOGLE");
        company_names.add("MICROSOFT");
        company_names.add("COGNIZANT");
        company_names.add("ZOHO");
        company_names.add("WIPRO"); 

        System.out.println("Companies Set: " + company_names);
        
        
               
                if (company_names.contains("ZOHO")) {
                    System.out.println("ZOHO is in the set.");
                }

              
                company_names.remove("COGNIZANT");
                System.out.println("After removing COGNIZANT: " + company_names);

    

                for (String c : company_names) {
                    System.out.println(c);
                }

  
                System.out.println("Total number of companies: " + company_names.size());
            }



	}

