package linkedListOfVehical;

public class Vehical {
	public Integer vehicalNo;
	public String company;
	public String model;
	public String type;
	public int price;
	public String colour;
	public Vehical(Integer vehicalNo, String company, String model, String type, int price, String colour) {
		super();
		this.vehicalNo = vehicalNo;
		this.company = company;
		this.model = model;
		this.type = type;
		this.price = price;
		this.colour = colour;
	}
	public Integer getVehicalNo() {
		return vehicalNo;
	}
	public void setVehicalNo(int vehicalNo) {
		this.vehicalNo = vehicalNo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Vehical [vehicalNo=" + vehicalNo + ", company=" + company + ", model=" + model + ", type=" + type
				+ ", price=" + price + ", colour=" + colour + "]\n";
	}
	
	
	
	
	
}
