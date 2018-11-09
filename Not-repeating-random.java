import java.security.Timestamp;
import java.sql.Time;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


@SuppressWarnings("unused")
class choice{
	
	
	static int i;
	final static int[] array = new int[100];
	
	 static void caclaute(int a)
	{
		
		 i = (int) (Math.random() * 100 + 1);
	        for (int b = 0; b < a; ++b)//[0] 1 [2] 2 [3] 1
	        {
	            if (array[b] == i) 
	            {
	                choice.caclaute(a);//break也行
	            }
	        }
	        array[a] = i;
		
	}
	/*int times(int time)
	{
		int b;
		if (time==1) 
		{
			return b=1;
		}
	
		return time*times(time-1);
	}*/
}



public class RandomChoice 
{


	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		choice choice=new choice();
	
		
	
		int[] array = new int[100];
		for (int a = 0; a < array.length; a++) 
		{
			choice.caclaute(a);
			System.out.print(choice.array[a]+"  ");
		    
		}
		//System.out.print(choice.times(5));

	}

}

