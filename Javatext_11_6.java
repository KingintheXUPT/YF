package Javatext_6_U11;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class Javatext_11_6 {
	Scanner in = new Scanner(System.in);
	public static void  main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList list = new ArrayList();
		Loan loan = new Loan(in.nextDouble());
		list.add(loan);
		Date date =new Date(in.next());
		list.add(date);
		Circle circle = new Circle(in.nextDouble());
		list.add(circle);
		System.out.println(list);
	}
}

class Loan{
	private double loan;
	public Loan(double loan){
		this.loan=loan;
	}
	public String toString(){
		return "loan"+loan;
	}
}

class Date{
	private String date;
	public Date(String date){
		this.date=date;
	}
	public String toString(){
		return "date"+date;
	}
}

class Circle{
	private double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public String toString(){
		return "ardius" + radius;
	}
}

