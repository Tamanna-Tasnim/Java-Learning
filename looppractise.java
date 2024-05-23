public class looppractise 
{
    public static void main(String[] args) 
    {
//print 1-10 using while loop
        /*int i=1;
        while(i<=10)
        {
           System.out.println(i);

           i++;
        } */ 
        
        
//print even number between 1-10
        /*int i=2;
        while(i<=10)
        {
           System.out.println(i);
           i+=2;
        } */
        
        /*int i=1; 
        while(i<=10)
        {
           if(i%2==0)
           {
            System.out.println(i);
           }
        i++;
        } */

        /*int i=1; 
        while(i<=10)
        {
           if(i%2==0)
           {
            System.out.println(i +"Even");
           }
           else
           {
            System.out.println(i+"Odd");
           }
        i++;
        } */

        /*int i=10; //print 10...1 in decreasing order
        while(i>0)
           {
            System.out.println(i);
            i--;
           } */
         

//Do while loop       
        /*int i=1;
        do
        {
         System.out.println(i);
         i++;
        }
        while(i<=10);*/

        /*int i=10;
        do
        {
         System.out.println(i);
         i--;
        }
        while(i>=1);*/

        
//For looping
      // for(int i=1; i<=10; i++) [print 1-10]
      //for(int i=2; i<=10; i+=2) [print even number]
      //for(int i=1; i<=10; i+=2) [print odd]
      /*{
         System.out.println(i);
      }*/

     for(int i=1; i<=5; i++)
      {
         for(int j=i; j<5; j++)
         {
            System.out.print(" ");
         }
         for (int k=1; k<=(2*i-1); k++) 
         {
            System.out.print("*");
         }
         System.out.println();      
      }
     
     
//palindrome number

      int r,sum=0,temp;    
      int n=454; 

      temp=n;    
      while(n>0)
      {
         r=n%10;   
         sum=(sum*10)+r;    
         n=n/10;    
      }    
      if(temp==sum)
      System.out.println("palindrome number ");    
      else    
      System.out.println("not palindrome"); 
      

   }
    
}
