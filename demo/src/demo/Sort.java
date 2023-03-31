package demo;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer; 
//non repeated character print
public class Sort{
	

		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine();
		        char []arr2=new char[7];
		        char []arr1=s.toCharArray();
		        
		        for(int i=0;i<arr1.length-1;i++)
		        {
		        	for(int j=i+1;j<=i;j++)
		        	{
		        		if(arr1[i]!=arr1[j]) 
		        		{
		        			arr2[0]=arr1[j];
		        			
		        		}
		        		
		        	}
		        }
		        System.out.println(arr2[0]);
		      
}
}
