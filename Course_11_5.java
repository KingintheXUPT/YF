package Javatext_6_U11;

import java.util.ArrayList;

public class Course_11_5 {
	public static void main(String[] args){
		ArrayList student = new ArrayList();
		Course[] stu = new Course[100];
		for(int i = 0;i<10;i++){
			stu[i] = new Course("i");
			stu[i].addStudent("i");
			student.add(stu[i]);
		}
		for(int i =0;i <student.size();i++){
			System.out.println(stu[i].getNumberOfStudents());
		}
	}
}

class Course{
	private String courseName;
	private String[] students = new String[1000];
	private int numberOfStudents;
	public Course(){
	}
	public Course(String courseName){
		this.courseName=courseName;
	}
	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getstudents(){
		return students;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String getCourseName(){
		return courseName;
	}
	public void dropStudent(String student){
		
	}
}
