package shop;

//import java.util.Date;

public class Product extends Item {
	
	private String producer;
	private String dateOfProduction;

	
	public Product(String name, String description, double price, String producer, String dateOfProduction) {

		super(name, description, price);
		this.producer = producer;
		this.dateOfProduction = dateOfProduction;
	}
	
	public void setProducer(String producer) {
		this.producer = producer; 
	}
	
	public void setDateOfProduction(String dateOfProduction) {
		this.dateOfProduction = dateOfProduction; 
	}

	public String getDateOfProduction() {
		return (this.dateOfProduction); 
	}
	
	public String getProducer() {
		return (this.producer); 
	}
}
