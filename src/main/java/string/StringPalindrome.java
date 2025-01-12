package string;

public class StringPalindrome {
    public static boolean isPlaindroem(String a){
        int left =0;
        int right = a.length()-1;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String a="abba";
        System.out.println(isPlaindroem(a));
    }

}
