import java.io.PrintWriter;

public class Main2 {
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String S = sc.next();
		String T = sc.next();
		int len = S.length();
		String res = "No";
		for(int i=1;i<=len;i++){
			if(T.contains(S.substring(0, i)) && T.contains(S.substring(i))){
				res = "Yes";
				break;
			}
		}
		out.println(res);
		out.flush();
	}
}
