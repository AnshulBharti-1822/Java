import java.util.Scanner;

public class RemovingPreZeros {

	public static void main(String[] args) {

		String str = "0075896";
		String S= "";
		for (int i =0;i<str.length();i++ ) {
			if (str.charAt(i)=='0') {
				continue;
				
			}else {
				S= str.substring(i);
				break;
			}
		}
		System.out.println(S);
	}

}
