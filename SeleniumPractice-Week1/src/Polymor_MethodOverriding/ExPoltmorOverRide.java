package Polymor_MethodOverriding;

    class ExPoltmorOverRide{
	public void MyVehichle(){
		System.out.println(" MyVehicle is a Maruti Car");
			}
			
			  public void show() { System.out.println("I am enjoying My VEHICHLE"); }
			 
	}	
 class Friend extends ExPoltmorOverRide{
	public void MyVehichle () {
		System.out.println("Friends vehichle is HondaBike");
	}
	}
class TestFriend {
	public static void main(String[] args) {
		Friend F1= new Friend ();
		F1.MyVehichle();
		F1.show();
		
	}
	
	
	
}


 