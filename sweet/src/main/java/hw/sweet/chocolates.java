package hw.sweet;
import java.util.Scanner;

public class chocolates {
	Scanner sc=new Scanner(System.in);
	public void candy() {
		System.out.println("Enter No. of Candies, weigth and price of each Candy");
		int number=sc.nextInt();
		int weight=sc.nextInt();
		int cost=sc.nextInt();
		System.out.println("Total weight of candies is:"+number*weight+"gms");
		System.out.println("Total cost of candies is:"+number*cost);
	}
	public void lollipop() {
		System.out.println("Enter No. of Lollipops, weigth and price of each lollipop");
		int number=sc.nextInt();
		int weight=sc.nextInt();
		int cost=sc.nextInt();
		System.out.println("Total weight of lollipop is:"+number*weight+"gms");
		System.out.println("Total cost of lollipop is:"+number*cost);
	}
	

}
