package com.seven.test;

public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester test = new Java8Tester();

        //类型声明
        MathOperation addition = (int a,int b) -> a + b;
        //不用类型声明
        MathOperation substraction = (a,b) -> a - b;
        //大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {return a * b;};
        //没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + test.operate(10,5,addition));
        System.out.println("10 - 5 = " + test.operate(10,5,substraction));
        System.out.println("10 * 5 = " + test.operate(10,5,multiplication));
        System.out.println("10 / 5 = " + test.operate(10,5,division));

        //不用括号
        GreetingService greetingService1 = message ->
                System.out.println("hello"+message);

        //用括号
        GreetingService greetingService2 = (message) ->
                System.out.println("hello"+message);

        greetingService1.sayMessage("Runoob");
        greetingService2.sayMessage("Google");
    }

    interface MathOperation{
        int operation(int a,int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
