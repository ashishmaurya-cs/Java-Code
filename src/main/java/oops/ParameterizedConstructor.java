package oops;

import java.util.Scanner;

public class ParameterizedConstructor {
    private String name;
    private  String age;

    public ParameterizedConstructor(String name,String age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age");
        String name = sc.next();
        String age = sc.next();
        ParameterizedConstructor p = new ParameterizedConstructor(name,age);
        System.out.println(p.name+" "+p.age);
    }

}
