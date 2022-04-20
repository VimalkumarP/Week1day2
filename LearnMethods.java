package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassName objectName=new ClassName();
		LearnMethods obj=new LearnMethods();
		//objectName.methodName();
		obj.printCarNmar();
		System.out.println(obj.getCarRegNumber());
		System.out.println(obj.getCarVarient());
		System.out.println(obj.multiplyTwoNumbers(7, 200));

	}
	public void printCarNmar() {
		System.out.println("Kia");
	}
	public int getCarRegNumber() {
		int regno=7410;
		return regno;
	}
	public String getCarVarient() {
		return "Seltos";
	}
	public int multiplyTwoNumbers(int a,int b) {
		return a*b;
	}

}
