package shop;



public class Service extends Item {
	private String typeOfPayment;
	//public enum TypeOfPayment {lumpSum, Hour};

	
	public Service(String name, String description, double price, String typeOfPayment) {
		super(name, description, price);
		this.typeOfPayment = typeOfPayment;
	}
	
	public void setTypeOfPayment(String typeOfPayment) {
		this.typeOfPayment = typeOfPayment; 
	}

	public String getTypeOfPayment(String typeOfPayment)
	{
		return typeOfPayment;
	}
}
