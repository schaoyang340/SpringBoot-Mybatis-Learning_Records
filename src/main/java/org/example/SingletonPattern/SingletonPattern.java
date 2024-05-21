package org.example.SingletonPattern;

//    单例模式
public class SingletonPattern {

//    饿汉式
    private SingletonPattern(){

    }

////    防止饿。一般不用下面这种方式，不可控
  //    private static final SingletonPattern singletonPattern = new SingletonPattern();
//    public static SingletonPattern newInstanc(){
//        return singletonPattern;
//    }

    private static SingletonPattern singletonPattern;

//    懒汉式
//    synchronized :线程同步锁
    public static synchronized SingletonPattern newInstanc(){
        if (singletonPattern == null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    public static void main(String[] args) {
//        输出false
        SingletonPattern s1 = new SingletonPattern();
        SingletonPattern s2 = new SingletonPattern();
        System.out.println(s1 == s2);

//        输出true
        SingletonPattern s3 = SingletonPattern.newInstanc();
        SingletonPattern s4 = SingletonPattern.newInstanc();
        System.out.println(s3 == s4);
    }
}
