/*2. Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments.*/

class Triangle{

public static void main(String []args){

   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
   int c=Integer.parseInt(args[2]);

   int perimeter=a+b+c;
   System.out.println("Perimeter is = " +perimeter);

}
}