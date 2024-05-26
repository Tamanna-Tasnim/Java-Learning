public class arraypractise {
    public static void main(String[] args) 
    {
        //int a[]={100,200,300,400,500};

        /*System.out.println("Length of an array:"+a.length); //Length finding

        System.out.println(a[0]); //Finding single value  */ 

//Reading all the value from array
//Normal for loop
        /*for (int i=0; i<=a.length-1; i++) 
        {
            System.out.println(a[i]);
        } */

//Enhance for loop [for....each loop]
        /*for(int x:a)
        {
            System.out.println(x);
        }*/


//Two dimentional array
    //Declering array
        /*int a[][] = {   {100,200}, 
                        {300,400}, 
                        {500,600}
                    };

        System.out.println("Length of rows" +a.length);
        System.out.println("Length of coloums:"+a[0].length);  */

        //System.out.println(a[2][1]); //single value

    //Normal loop
       /*for(int r=0; r<=a.length;r++)
       {
        for(int c=0; c<=a[r].length-1;c++)
        {
            System.out.println(a[r][c]);
        }
        System.out.println();
       }*/

    //Enhance for loop [for....each loop]
       /*for(int arr[]:a)
       {
        for(int x:arr)
        {
            System.out.println(x+"  ");
        }
       }*/



//Object array
       Object a[]= {100, 10.2, 'A', "Hello", true};  //object take all types of data

       /*for (Object x : a) 
       {
        System.out.println(x);
       }*/

       for(int i=0; i<=a.length-1;i++)
       {
        System.out.println(a[i]);
       }

    }

}



