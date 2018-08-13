import java.util.Scanner;

public class question2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int Big=0;
		int remainder;
		if(A-8 <0 && A!=5) {
			if(A==4 || A==7){
				System.out.print(-1);
				return;
			}
			if(A==3||A==6) {
				System.out.println(A/3);
				return;
			}
		}
		
		if(A%5 ==1 || A%5 ==4)
			Big= A/5 -1;
		
		if(A%5 == 2) 
			Big= A/5 -2;
		
		if(A%5 == 0 || A%5==3)
			Big = A/5;	

		A = A-5*Big;
		remainder = A/3;
		System.out.println(Big+remainder);
		

	}
}
