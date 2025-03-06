import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1:");
		String str1 = sc.next();
		System.out.print("Enter string 2:");
		String str2 = sc.next();
		str1= str1.toLowerCase();
		str2= str2.toLowerCase();
		if (str1.length()==str2.length()) {
			char[] a= str1.toCharArray();
			char[] b= str2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			boolean result = Arrays.equals(a,b);
			if (result) {
				System.out.println(str1+"and"+str2+" are Anagram");
			}else {
				System.out.println(str1+"and"+str2+"are not Anagram");
			}
			
			}
	}

}
