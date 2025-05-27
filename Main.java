package selScripts;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garage garage = new Garage();
		
		Cars cars1 = new Cars("BMW");
		Cars cars2 = new Cars("Audi");
		Cars cars3 = new Cars("Tesla");
			
		garage.iparkmo(cars1);	
		garage.iparkmo(cars2);		
		garage.iparkmo(cars3);		
			
			
	}

}
