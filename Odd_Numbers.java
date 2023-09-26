public class Odd_Numbers {

	public static void main(String[] args) {
		
		int n1 = 7;
		int n2 = 21;
		int sum =0;
		for(int i=n1;i<=n2;i++)
		{
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("Sum of odd numbers between"+n1+"and"+n2+"is:"+sum);
	}

}
