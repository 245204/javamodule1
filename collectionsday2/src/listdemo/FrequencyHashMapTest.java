package listdemo;             //number of words and there count

import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		
		String str="hi my name is hi my name is not";
		String[] strArr=str.split(" ");
		System.out.println(strArr.length);   //got the length
		HashMap<String,Integer>  map1=new HashMap<>();
		
		for(String str1: strArr)
		{
			if(map1.get(str1)==null)
			{
				map1.put(str1,1);
			}
			else
			{
				int i=map1.get(str1); //we get the value of str1 here so we keep in the integer
				i++;                  
				map1.put(str1, i);
			}
		}
		System.out.println(map1);
		}
		
}

