package string;

public class ReverseStringKeepSpecialCharPosition {
	public static void main(String[] args) {

		String s = "ayr-uaMhsi-hsAmaR";

		StringBuffer sb = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != '-') {
				sb.append(s.charAt(i));
			}
		}
		int i=0;
		StringBuffer fn = new StringBuffer();
		for (int j=0;j<s.length();j++) {
			if (s.charAt(j) != '-') {
				fn.append(sb.charAt(i));
				i++;
			}else {
				fn.append('-');
			}
		}
		System.out.println(fn.toString());
	}
}
