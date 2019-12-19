/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author hp
 */
public class Student {
 private String name;
 private String Father_name;
 private String University;
 private int age;
 private int rollno;
public Student(){}
    public Student(String name, String Father_name, String University, int age, int rollno) {
        this.name = name;
        this.Father_name = Father_name;
        this.University = University;
        this.age = age;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return Father_name;
    }

    public void setFather_name(String Father_name) {
        this.Father_name = Father_name;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
 
}
