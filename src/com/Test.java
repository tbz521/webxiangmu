package com;

public class Test {
    public static void main(String[] args) {
        System.out.println("我爱你");
        test();
        Test test=new Test();
        int a=test.add(5,3);
        System.out.println(a);
    }
    public static void test(){
        System.out.println("杨丽红");
    }
    public int add(int x,int y){
        int s=x+y;
        return s;
    }
}
