package hw.sweet;
import java.util.Scanner;
public class sweets {
	Scanner sc=new Scanner(System.in);
	public void kajukatli() {
		System.out.println("Enter the amount of sweet in grams and cost per kg");
		int weight=sc.nextInt();
		int cost=sc.nextInt();
		System.out.println("Total cost of candies is:"+(weight/1000)*cost);
	}
	public void motichoor() {
		System.out.println("Enter the amount of sweet in grams and cost per kg");
		int weight=sc.nextInt();
		int cost=sc.nextInt();
		System.out.println("Total cost of candies is:"+(weight/1000)*cost);
	}
}
