import java.io.*;
import java.util.StringTokenizer;

public class question2863 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(br.readLine()); 
		double a, b, c, d;
		a = Integer.parseInt(tokenizer.nextToken());
		b = Integer.parseInt(tokenizer.nextToken());
		tokenizer = new StringTokenizer(br.readLine()); 
		c = Integer.parseInt(tokenizer.nextToken());
		d = Integer.parseInt(tokenizer.nextToken());
		br.close();
		
		double[] maximum = new double[5];
		maximum[0] = a/c + b/d;
		maximum[1] = c/d + a/b;
		maximum[2] = d/b + c/a;
		maximum[3] = b/a + d/c;
		double max = maximum[0];
		
		for(int i =1; i<4; i++) {
			if(max <maximum[i])
				max = maximum[i];
		}
		
		int i =0;
		while(maximum[i] != max) {
			i++;
		}
		System.out.println(i);

}
}
