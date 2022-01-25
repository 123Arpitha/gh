package locators;

public class RemoteCalculator implements Calculator {

	@Override
	public int add(int...arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a:arr)
		{
			sum=sum+a;
		}
		return sum;
	}

	@Override
	public int sub(int...arr) {
		// TODO Auto-generated method stub
		int sub=0;
		for(int a:arr)
		{
			sub=a-(sub);
		}
		return sub;
	}

	@Override
	public int mul(int... arr) {
		// TODO Auto-generated method stub
		int mul=1;
		for(int a:arr)
		{
			mul=mul*a;
		}
		return mul;
	}
	

		

	}


