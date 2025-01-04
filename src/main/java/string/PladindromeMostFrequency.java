package string;

import java.util.HashMap;
import java.util.Map;

public class PladindromeMostFrequency {
	public static boolean isBoolean(String s ) {
		String sn="";
		boolean st;
		for(int i=s.length()-1;i>=0;i--) {
			sn = sn+s.charAt(i);
		}
		if(sn.equals(s)) {
			st=true;
		}
		else {
			st=false;
		}
		return st;
	}
public static void main(String[] args) {
	String s="Amit bob Amit ana bob ana ana tot bob bob";
	String[] ss= s.split("\\s");
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	for(int i=0;i<ss.length;i++) {
		Boolean status = isBoolean(ss[i]);
		if(status) {
			map.put(ss[i], map.getOrDefault(ss[i], 0)+1);
		}
	}
	
	int max=0;
	for(Map.Entry<String, Integer> m: map.entrySet()) {
		if(m.getValue() > max) {
			max=m.getValue();
		}
	}

	
	for(Map.Entry<String, Integer> m: map.entrySet()) {
		if(m.getValue()==max) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	
}
}
