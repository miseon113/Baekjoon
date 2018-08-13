import java.util.Scanner;

public class question2675 {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int num;
	String word;
	int j =0;
	
	for(int i =0; i<T; i++) {
		num = sc.nextInt();
		word = sc.next();
		int k = num*word.length();
		char[][] cutWord = new char[T][k];
		while(k!=0){
			cutWord[num][j] = word.charAt(num);
			num++;
			j++;
		}
		System.out.println(cutWord[i]);
	}
	
 }
}
