package prime;

public class MultipliactionTable {

	public static void main(String[] args) {
		
		int num=Integer.parseInt(args[0]);
		
		System.out.println(" Multiplication Table");
		
		for(int i=1;i<num;i++) 
		{
			
			for(int j=1;i<=num;j++)
			{
				
				System.out.println(" "+i*j+" ");
			}
			
			System.out.print("\n");
		}

	}

}
