package string;

public class RemoveDups {
    String removeDups(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            if (sb.indexOf(String.valueOf(currentChar)) == -1) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDups().removeDups("ashish"));
    }
}
