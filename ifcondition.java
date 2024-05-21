public class ifcondition 
{
    public static void main(String[] args)
    {
    /* int person_age=15;

       if(person_age>=18)
        {
            System.out.println("Eligible for vote.");
        }
        else
        {
            System.out.println("Not eligible for vote.");
        }
// Other process
        if(person_age>=18)
        System.out.println("Eligible for vote.");
        else
        System.out.println("Not eligible for vote."); */ 



//Even odd number check
        /*int n=11;

        if(n%2==0)
        System.out.println("Number is even");
        else
        System.out.println("Number is odd"); */

//Positive, negative, zero number check
        /*int n=20;

        if (n>0) 
        {
            System.out.println("Number is positive.");    
        }
        else if (n<0) 
        {
            System.out.println("Number is negative.");    
        }
        else 
        {
            System.out.println("Number is zero.");    
        } */

//Largest among three numbers

        /*int a=12, b=20, c=11;
        if (a>b && a>c)
        {
            System.out.println("a is largest number:"+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("b is largest number:"+b);
        }
        else
        {
            System.out.println("c is largest number:"+c);
        }*/

// Multiple statements of if/else
        
        /*if(false)
        { 
            System.out.println(1);
        }
        else
        {
            System.out.println(2);
        } */


        /*if(1==1)
        { 
            System.out.println(1);
        }
        else
        {
            System.out.println(2);
        }*/


        /*if(true)
        { 
            if(false)
            {
                System.out.println("abc");
            }
            else
            {
                System.out.println("xyz");
            }
        }
        else
        {
            System.out.println("123");
        }*/


//Display week names based on week number

         /*int weekno=7;

        if(weekno==1)
        {
            System.out.println("It's Saturday.");
        }
        else if(weekno==2)
        {
            System.out.println("It's Sunday.");
        }
        else if(weekno==3)
        {
            System.out.println("It's Monday.");
        }
        else if(weekno==4)
        {
            System.out.println("It's Tuesday.");
        }
        else if(weekno==5)
        {
            System.out.println("It's Wednesday.");
        }
        else if(weekno==6)
        {
            System.out.println("It's Thursday.");
        }
        else if(weekno==7)
        {
            System.out.println("It's Friday!");
        }
        else  
        {
            System.out.println("Invalid week number.");
        }*/


//Switch case statement

        int weekno=10;

        switch(weekno)
        {
            case 1: System.out.println("Saturday");
            break;
            case 2: System.out.println("Sunday");
            break;
            case 3: System.out.println("Monday");            
            break;
            case 4: System.out.println("Tuesday");
            break;
            case 5: System.out.println("Wednesday");
            break;
            case 6: System.out.println("Thursday");

            
            break;
            case 7: System.out.println("Friday");
            break;
            default: System.out.println("Invalid");


        }


    }
    
}
