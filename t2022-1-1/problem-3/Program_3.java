import java.util.Scanner;
public class Program_3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int limit=sc.nextInt();
		int num=1;
		if (limit%2==0)
		{
			limit-=1;
			for (int i=1 ;i<=limit ;i++ )
			{
				System.out.print(num+" ");
				num+=2;
			}
		}
		else
		{
			for (int i=1 ;i<=limit ;i++ )
			{
				System.out.print(num+" ");
				num+=2;
			}
		}
	}
}
