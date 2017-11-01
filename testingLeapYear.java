import java.util.Scanner;
public class testingLeapYear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int year=in.nextInt();
		boolean results=isLeapYear(year);
		System.out.println(results);

	}
	
	public static boolean isLeapYear(int year)
	{
		int testingFactor=year/100;
		boolean isLy=false;
		
		if (year>1582)
		{
			if (year%4==0)
			{	
				if (testingFactor%4==0) 
				{
					isLy=true;			
				}
				else 
				{
					isLy=false;
				}
				isLy=true;
			} 
				return isLy;
			
		}
		else
		{
			return isLy;
		}
	
	}

}
