import java.util.Scanner;

public class question1978 {
	Scanner sc = new Scanner(System.in);
	int num;
	int[] numbering = new int[1000];
	num = sc.nextInt();
	int k =0;
	 
	// ����ڰ� �Է��� �� ������ �迭�� �� �����.
	for(int i=0; i< numbering.length(); i++) {
		numbering[i]= sc.nextInt();
	}
	
	public void removeNum() {
		for(int j=i; j<numbering.length-1; j++) {
			numbering[j] = numbering[j+1];
		}
	}
	// ������ �迭���� �Ҽ� ã�Ƴ�
	for(i=0; i<numbering.length(); i++) {
		if(numbering[i]%2 == 0)
			numbering.delete(i);
			// 2�� ����� delete ����.
		if(numbering[i]%3 == 0)
			
	}
/*	for(int j=0; j<numbering.length; j++) {
		if(numbering[numbering.length -1] <= 100) {
			if(numbering[j] == 1 || numbering[j] == 2 || numbering[j]==3 || numbering[j]==5 || numbering[j]==7) {
				prime[k] = numbering[j];
				k++;
			}	
		}
		
	}
	int l;
	int m;
	*/
	
}	
