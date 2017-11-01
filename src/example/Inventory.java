package example;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	private List<CellPhone> cellPhone;	
	
	public Inventory() {		
		cellPhone = new ArrayList<CellPhone>();			
	}
	
	public void addCellPhone(CellPhone phoneObj) {
		cellPhone.add(phoneObj);
	}
	
	public void listCellPhones()  {		
		for(CellPhone cellPhone:cellPhone){
			System.out.println(cellPhone);
		}
		
		if(cellPhone == null || (cellPhone!=null && cellPhone.size() == 0)){
			System.out.println("No Data Found !!!");
		}
	}
	 
   public void findCellPhone(int productId)  {
	   boolean isExist = false;
	   for(CellPhone cellPhone:cellPhone){
		   if(cellPhone.getProductId() == productId){
			   System.out.println(cellPhone);
			   isExist = true;
		   }			
		}	
	   if(!isExist){
			System.out.println("No Data Found !!!");
	   }
   }
	
   
   public void deleteCellphone(int productId) {
	   boolean isExist = false;
	   for(CellPhone phone:cellPhone){
		   if(phone.getProductId() == productId){
			   cellPhone.remove(phone);		
			   System.out.println("\n"+productId + " cellphone deleted successfully");
			   isExist = true;
			   break;
		   }
		}
	   if(!isExist){
			System.out.println("No Data Found !!!");
	   }
   }

}
