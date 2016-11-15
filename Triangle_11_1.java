package Javatext_6_U11;

import java.util.Date;

public class Triangle_11_1 {
	public static void main(String[] args){
		Triangle triangle = new Triangle(1,1.5,1);
		triangle.setColor("yellow");
		triangle.setFilled(true);
		System.out.println(triangle.getArea()+" "+triangle.getperimeter()+" "+triangle.getColor()+ " " +triangle.isFilled());
	}
}
class GeometricObject {
    private String color = "white";
    private boolean filled;
    Date dateCreated;
    
    public GeometricObject() {
        dateCreated = new Date();
    }
    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        Date dateCreated = new Date();
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public String toString() {
        return "Created on " + dateCreated + "\ncolor " + color +
                " and filled" + filled;
    }   
}


class Triangle extends GeometricObject{
	private double side1=0,side2=0,side3=0;
	public Triangle(){		
	}
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
	public double getperimeter(){
		return (side1+side2+side3);
	}
	public double getArea(){
		double s=getperimeter()/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	  public String toString() {
	        return "Triangle side1=" + side1 + "side2 = "  + side2 +"side3=" +side3;
	   }   	
}

