import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		List<Integer> aList = new ArrayList<>();
		for(int i=0;i<3;i++){
			aList.add(sc.nextInt());
		}
		Collections.sort(aList);
		out.println(aList.get(2)-aList.get(0));
		out.flush();
	}

}
