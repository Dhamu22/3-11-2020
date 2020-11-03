
public class EvenOrOdd {

	public static void main(String[] args) {
		int array[]= {2,3,4,5,6,7,8,9,10,11,12,13,14};
		System.out.println("The even Numbers are:");
			for (int i=0; i<=12; i++)
			{
				if(array[i]%2==0)
				{
					System.out.println(array[i]);
				}
				
			}
		System.out.println("The odd Numbers are:");
		for (int i=0; i<=12; i++)
		{
			if(array[i]%2!=0)
			{
				System.out.println(array[i]);
			}
			
		}
	}

}
