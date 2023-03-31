package demo;

class Test
{
   public static void main(String[] args) throws Exception
   {
      int[] a = null;
      int i = a [ m1() ];
   }
   public static int m1() throws Exception
   {
     throw new Exception("some exception");
//	   return 0;
   }
}