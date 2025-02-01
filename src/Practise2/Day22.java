package Practise2;

import java.util.Collections;

class Student{
	String name;
	int age;
	String grade;

public Student() {
	name = "unknown";
	age = 0;
	grade = "Not assigned";
}
public Student(String name) {
	this.name = name;
	age = 0;
	grade = "Not assigned";
	}
public Student(String name,int age) {
	this.name = name;
	this.age = age;
	grade = "Not assigned";
}
public Student(String name,int age,String grade) {
	this.name = name;
	this.age = age;
	this.grade = grade;
}
public void display() {
	System.out.println("Name: "+name+" Age: "+age+" Grade: "+grade);
}
}

public class Day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Jeevan",25,"A++");
		s.display();
		
		

	}

}
