import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1;
		while(num>0)
		{
			fact = fact*num;
			num=num-1;
		}
		if (num<0) {
			System.out.println("Factorial not define for negative number !");
		}else {
			System.out.print("The factorial of the given number is : ");
			System.out.println(fact);
			}
		}
}
