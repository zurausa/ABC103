import java.io.PrintWriter;

public class Main3 {
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long res = 0;
		for(int i=0;i<N;i++){
			res += sc.nextInt() - 1;
		}
		out.println(res);
		out.flush();
	}
}
