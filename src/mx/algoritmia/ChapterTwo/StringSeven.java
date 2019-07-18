package ChapterTwo;
import java.util.StringTokenizer;

public class StringSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Irving|Nagatomo|Penaldo|Pulga";
		StringTokenizer st = new StringTokenizer(s, "|");
		
		String tok;
		while (st.hasMoreTokens()) {
			tok = st.nextToken();
			System.out.print(tok);
		}
	}

}
