package org.example;

public class Student {
    private String name;
    private int age;
    private int sno;
    public Student() {
    }
    public Student(String name, int age, int sno) {
        this.name = name;
        this.age = age;
        this.sno = sno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSno() {
        return sno;
    }
    public void setSno(int sno) {
        this.sno = sno;
    }
}