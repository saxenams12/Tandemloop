import java.util.Scanner;
public class Program_4 
{
	public static void main(String[] args) 
	{
		int two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Element you want to Store");
		int len=sc.nextInt();
		int[] input=new int[len];
		System.out.println("Enter the elements of the array "); 
		for (int i=0 ;i<len ;i++ )
		{
			input[i]=sc.nextInt();
			if (input[i]%2==0)
			{
				two++;
			}
			if (input[i]%3==0)
			{
				three++;
			}
			 if (input[i]%4==0)
			{
				four++;
			}
			 if (input[i]%5==0)
			{
				five++;
			}
			 if (input[i]%6==0)
			{
				six++;
			}
			 if (input[i]%7==0)
			{
				seven++;
			}
			 if (input[i]%8==0)
			{
				eight++;
			}
			 if (input[i]%9==0)
			{
				nine++;
			}
		}//for close
		System.out.println("1 : "+len+" ,2 :  "+two+" ,3 : "+three+" ,4 :  "+four+" ,5 :  "+five+" ,6 :  "+six+" ,7 :  "+seven+" ,8 :  "+eight+" ,9 :  "+nine); 

	}
}
