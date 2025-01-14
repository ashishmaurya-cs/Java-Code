package java8;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    int calculate(int n);

class Square{
    public static void main(String[] args) {
        //anonymous class
//        FunctionalInterface f = new FunctionalInterface(){
//            public int  calculate(int n){
//                return n*n;
//            }
//        };

            FunctionalInterface f = (n) -> n * n;



        System.out.println(f.calculate(7));
    }
}
}
