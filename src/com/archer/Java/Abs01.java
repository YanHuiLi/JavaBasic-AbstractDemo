package com.archer.Java;

/**
 * Created by Archer on 2016/3/27.
 */
public class Abs01 {
    public static void main(String[] args) {
AbsDemo absDemo=new AbsDemo();
        absDemo.setAge(20);
        absDemo.say();


        absDemo.print();
    }
}

//只有抽象类能包含抽象方法

abstract class Abs{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public void tell(){

    }
    //抽象方法
    public   abstract void  say();
    public abstract void  print();
}


class AbsDemo extends Abs{

    //必须复写所有抽象方法。
    @Override
    public void say() {
        System.out.println(getAge());
    }

    @Override
    public void print() {

    }
}

