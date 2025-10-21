package BikeVibe;

public class Bike {
   private String bikeModel;
   private String bikeType;
   private String bikeStatus;
   private int bikePrice;
   public Bike() {
   }
   public Bike(String bikeModel, String bikeType, String bikeStatus, int bikePrice) {
	super();
	this.bikeModel = bikeModel;
	this.bikeType = bikeType;
	this.bikeStatus = bikeStatus;
	this.bikePrice = bikePrice;
   }
   public String getBikeModel() {
	return bikeModel;
   }
   public void setBikeModel(String bikeModel) {
	this.bikeModel = bikeModel;
   }
   public String getBikeType() {
	return bikeType;
   }
   public void setBikeType(String bikeType) {
	this.bikeType = bikeType;
   }
   public String getBikeStatus() {
	return bikeStatus;
   }
   public void setBikeStatus(String bikeStatus) {
	this.bikeStatus = bikeStatus;
   }
   public int getBikePrice() {
	return bikePrice;
   }
   public void setBikePrice(int bikePrice) {
	this.bikePrice = bikePrice;
   }
   public static Bike verifyBikeDetails(String bikeDetails)throws InvalidException {
	   String words[]=bikeDetails.split(":");
	   String model=words[0];
	   String type=words[1];
	   String status=words[2];
	   if(!model.matches("BKE/\\d{4}")) {
		   throw new InvalidException("Invalid bike details");
		   
	   }
	   if(!type.equals("Sport")&&!type.equals("Cruiser")&&!type.equals("")) {
		   throw new InvalidException("Invalid bike details");
	   }
	   
	   if(!status.equals("New")&& !status.equals("Used")) {
		   throw new InvalidException("Invalid bike details");
	   }
	   int pr;
	   try {
		  pr=Integer.parseInt(words[3]);
		   if(pr<0) {
			   throw new InvalidException("Invalid bike details");
		   }
	   }
	   catch(InvalidException e) {
		   throw new InvalidException("Invalid bike details");
	   }
	   return new Bike(model,type,status,pr);
   }
}
