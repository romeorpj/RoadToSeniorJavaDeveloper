public class Hello {
   public static void main(String[] args){
       System.out.println("Hello Richard");

       int myFirstNum = (5 + 10) * (2 +2);
       //java is strongly typed
       // int is the datatype
       //this is a declaration statement

//       q1. print out myfirstnum
       System.out.println(myFirstNum);


/*challenge: declare mySecondNumber as an int and assign it the value 12.Declare my third number int and
assign it the value 6.*/

       int mySecondNum = 12;
       int myThirdNum = 6;

       int myTotal = mySecondNum + myThirdNum * myFirstNum;

       int myLastOne = myTotal - 100;
       System.out.println("myTotal" + " " +myTotal);
       System.out.println("myLastOne" + " " +myLastOne);
   }
}
