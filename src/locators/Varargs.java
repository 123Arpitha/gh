package locators;

public class Varargs extends RemoteCalculator{
	public static void main(String[] args) 
	{
		Calculator cal = new RemoteCalculator();
		System.out.println(cal.add(10,20,20));
		System.out.println(cal.sub(70,60));
		System.out.println(cal.mul(2,3,4,5));
	}
}
