package guessthenumber;
import java.util.*;
public class NumberGame {
			public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
				int R =(int)(Math.random()*100+1);
				System.out.print("Enter a positve number below 100");
				int N =sc.nextInt();

					int c=1;

					while (N !=R) {

					c++;

					if (N<R)

					System.out.println(N+ " is smaller");

					else

					System.out.println(N+ " is Greater");

					System.out.print("Enter another number: ");

					N =sc.nextInt();

					}
				if (c==1) 
					System.out.println("*****\nCongratulations!!!");

					else if (c==2) System.out.println("***\nCongratulations!!");

					else if (c==3) System.out.println("\nCongratulations!");

					else
						System.out.println("You win!");
				}
			}

