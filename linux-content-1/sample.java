class sample
{
   public static void main(String [] args)
   {  
      while(true)
      {
         System.out.println("Hello Everyone!");
         try
         {
            Thread.sleep(2000);
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
      }
   }
}
