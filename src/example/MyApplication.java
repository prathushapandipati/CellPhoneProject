package example;

public class MyApplication {

	public static void main(String[] args) {
		
		Inventory inventory = new Inventory();
		
		//  add cellphone
		inventory.addCellPhone(new CellPhone(1234,"Nokia","N16",45677,10004.56));
		inventory.addCellPhone(new CellPhone(1235,"Apple","8",12345,50000));
		inventory.addCellPhone(new CellPhone(1236,"Samsung","N8",34555,20000));
		inventory.addCellPhone(new CellPhone(1237,"Nexus","5",455677,300000));
		
		System.out.println("List of CellPhones :");
	    //  list cellphone		
		inventory.listCellPhones();
		
		System.out.println("\nFind cellphone:");
		// find cellphone by productId
		inventory.findCellPhone(1237);
		
		System.out.println("\nDeleted cellphone object:");
		// delete cellphone by productId
		inventory.deleteCellphone(1237);
		
		System.out.println("\nList of CellPhones :");
	    //  list cellphone		
		inventory.listCellPhones();
		
	

	}

}
