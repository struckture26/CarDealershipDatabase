
public class Vehicle {
	private boolean newVehicle = true;
	private String year;
	private String make;
	private String model;
	private String salePrice;
	private String vinNumber;

	private String descriptionOfVehicle;


	public Vehicle()
	{}


	public Vehicle(boolean newVehicle, String vinNumber, String year, String make, String model, 
						 String salePrice, String descriptionOfVehicle)

	{
			
		
		this.newVehicle = newVehicle;
		this.year = year;
		this.make = make;
		this.model = model;
		this.salePrice = salePrice;
		this.descriptionOfVehicle = descriptionOfVehicle;
		
		
	}


	public boolean isNewVehicle() {
		return newVehicle;
	}


	public void setNewVehicle(boolean newVehicle) {
		this.newVehicle = newVehicle;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getSalePrice() {
		return salePrice;
	}


	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}


	public String getVinNumber() {
		return vinNumber;
	}


	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}


	public String getDescriptionOfVehicle() {
		return descriptionOfVehicle;
	}


	public void setDescriptionOfVehicle(String descriptionOfVehicle) {
		this.descriptionOfVehicle = descriptionOfVehicle;
	}
	
	

}
