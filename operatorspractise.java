public class operatorspractise 
{
    public static void main(String[] args)
    {
        //Arithmetic operators + - * / %
    
        int a=20, b=10;

        int result=a*b;
        System.out.println("Sum of the a and b is:"+(result));
        System.out.println("Subtract of the a and b is:"+(a-b));
        System.out.println("Multiply of the a and b is:"+(a*b));
        System.out.println("Division of the a and b is:"+(a/b));
        System.out.println("Modulo of the a and b is:"+(a%b));


        //Relational operators > <= < <= != ==
        //Boolean value returns

        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a>=b); //true
        System.out.println(a<=b); //false
       
       
        b=40;
        System.out.println(a>=b); //true
        System.out.println(a<=b); //true
        System.out.println(a!=b); //false
        System.out.println(a==b); //true
        
        boolean res=a>b;
        System.out.println(res); //false



        //Logical operators && || !
        //Returns boolean value 
        
        boolean x=true;
        boolean y=false;

        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x); //false
        System.out.println(!y); //true
        
        boolean b1=10>20;
        System.out.println(b1); //false
        boolean b2=20>10;
        System.out.println(b1 && b2); //false


    }    
    

}
