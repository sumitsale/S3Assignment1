import java.util.Scanner;

class S3Assignment1
{
   public static void main(String args[])
   {
		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");
		number = in.nextInt();
		
		System.out.println("sqrt of " + number +" is - "+ Math.sqrt(number));
		System.out.println("cbrt of " + number +" is - "+ Math.cbrt(number));
   }
}