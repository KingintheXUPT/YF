package Javatext_6_U11;

import java.util.Date;

public class javatext_person_11_2 {
	public static void main(String[] args){
		Student stu = new Student();
		stu.name="������";
		stu.address="610����";
		stu.E_mail="610@213";
		stu.grade = "���";
		Faculty fac = new Faculty();
		fac.name="ɯ��ȫ��";
		fac.address="����Է";
		fac.E_mail="138@11";
		fac.office = "FF213";
		fac.DateOfAppointment = "2016.6.28";
		fac.wages = 100000;
		fac.Class = "�꼶����";
		fac.WOF.year=2015;
		fac.WOF.month=4;
		fac.WOF.day = 3;
		System.out.println("ѧ������Ϣ:"+stu.toString()+"\n"+"ְԱ����Ϣ"+fac.toString());
	}
}

class Person{
	protected String name = "no name";
	protected String address = "no address";
	protected String E_mail = "no E-mail";
	public void Person(){
	}
    public String toString() {
        return "class name " +getClass()+"name" + name + "address" +address +"E-mail" +E_mail;
    }   
}

class Student extends Person{
	String grade = "no grade";
    public String toString() {
        return "class name " +getClass()+"name" + name + "address" +address +"E-mail" +E_mail + "grade" +grade;
    } 
}

class Employee extends Person{
	protected String office="No office";
	protected int wages=0;
	protected String DateOfAppointment;
    public String toString() {
        return "class name " +getClass()+"name" + name + "address" +address +"E-mail" +E_mail+"office"+office+"wages"+wages+"DateOfAppointment"+DateOfAppointment;
    }   
}

class Faculty extends Employee{
	protected Mydate WOF = new Mydate();
	protected String Class;
    public String toString() {
        return "class name " +getClass()+"name" + name + "address" +address +"E-mail" +E_mail+"Mydate"+"year:"+WOF.year+"month"+WOF.month+"day"+WOF.day;
    } 
}

class Mydate{
	int year;
	int month;
	int day;
}

class Staff extends Employee{
	private String tittle;
    public String toString() {
        return "class name " +getClass()+"name" + name + "address" +address +"E-mail" +E_mail+"tittle"+tittle;
    } 
}
