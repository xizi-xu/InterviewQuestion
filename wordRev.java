import java.lang.String;

public class wordRev {
	public static void main (String[] args) {
		String a = "I need a job really badly!!";
		String b = reverseWord(a);
		System.out.println(b);
	}

	public static String reverseWord (String input) {
		if (input == null) {
			return null;
		}

		int len = input.length();
		String temp = "";

		for (int i = len -1; i >= 0; i--) {
			temp = temp + input.charAt(i);
		}
		return temp;
	}
}