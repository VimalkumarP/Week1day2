package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Calculator obj=new Calculator();
 System.out.println(obj.Sum(97,8,9));
 System.out.println(obj.Sub(97,8,9));
 System.out.println(obj.Mul(97,8,9));
 System.out.println(obj.Div(97,8,9));
	}
	public int Sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public int Sub(int a,int b,int c)
	{
		return a-b-c;
	}
	public double Mul(double a,int b,int c)
	{
		return a*b*c;
	}
	public float Div(float a,int b,int c)
	{
		return a/b/c;
	}

}
