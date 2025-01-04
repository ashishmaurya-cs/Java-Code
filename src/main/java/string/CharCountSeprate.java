package string;

public class CharCountSeprate {
	public static void main(String[] args) {
		String str = "aaacccdfghaarcc";
		// output:a3c3d1f1g1h1a2r1c2
		int count = 1;
		StringBuilder  result = new  StringBuilder();

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				count = count + 1;

			} else {
				
				result.append(str.charAt(i-1)).append(count);
				count = 1;
			}

		}
		result.append(str.charAt(str.length()-1)).append(count);
		
		System.out.println(result.toString());
	}

}
