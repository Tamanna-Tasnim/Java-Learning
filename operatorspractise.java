public class operatorspractise 
{
    public static void main(String[] args)
    {
//Arithmetic operators + - * / %
    
         int a=20, b=10;

        /*int result=a*b;
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
    
//Incriment and decrement operator ++ --
    case 1
        System.err.println(a);
        a++;            //a=a+1
        System.err.println(a); 
        
    //case 2--post increment [Here 1st assignment the value and then increment happen]
        int res= a++;
        System.out.println(res);
        System.out.println(a);

    //post decrement [Here 1st assign the value then the value will decrement]      
        int rest= b--;
        System.out.println(rest);
        System.out.println(b);

    //case 3-- pre increment [Here 1st the value will increment happen then assign the value]     
        int res= ++a;
        System.out.println(res);
        System.out.println(a);

    //pre decrement [Here 1st the value will decrement then assign the value]     
        int rest= --b;
        System.out.println(rest);
        System.out.println(b);  


//Assignment operators = += -= *= /= %=
        
        a+=5;    //a=a+5
        System.err.println(a);

        a-=5;    //a=a-5
        System.err.println(a);

        a*=5;    //a=a*5
        System.err.println(a);

        a/=5;    //a=a/5
        System.err.println(a);

        a%=5;    //a=a%5
        System.err.println(a); */


//Conditional/ternary operator  ? :

        int x= (a<b) ? a:b;  //[if (a<b) is true then return b; otherwise returns a]
        System.out.println(x);

        int y= (1==2)? 200:100;
        System.out.println(y);

        int person_age=12;
        String result= (person_age>=18)? "Eligible":"Not eligible";
        System.out.println(result);










    }    
    

}
