package example;

public class CellPhone {
	
	private int productId;
	private String name;
	private String model;
	private int serialNumber;
	private double price;
	
	public CellPhone(int productId,String name,String model,int serialNumber,double price){
		this.productId = productId;
		this.name = name;
		this.model = model;
		this.serialNumber = serialNumber;
		this.price = price;
	}
		
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString(){
		StringBuffer cellPhoneObject = new StringBuffer();
		cellPhoneObject.append("productId:"+productId);
		cellPhoneObject.append("\t Name:"+name);
		cellPhoneObject.append("\t Model:"+model);
		cellPhoneObject.append("\t SerialNumber:"+serialNumber);
		cellPhoneObject.append("\t Price:"+price);      
		return cellPhoneObject.toString();
	}
	
	public boolean equals(Object obj) { 
		CellPhone cellPhone = (CellPhone) obj;
		return productId == cellPhone.getProductId();	
	} 

	

}
