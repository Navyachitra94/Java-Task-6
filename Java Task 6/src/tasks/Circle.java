package tasks;

public class Circle {
	
	//Data member
	 private double radius;
	 
	 //Constructors
	 public Circle() {
	        this.radius = 1.0;            
	    }
	 
	 public Circle(double radius, double ignoredPi) {   //example for constructor overloading
	        this.radius = radius;        
	    }
	 
	 public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	public static void main(String[] args) {

		 	Circle c1 = new Circle();            
	        Circle c2 = new Circle(2.5, 0); 

	        System.out.printf("c1 circumference: %.2f%n", c1.getCircumference());
	        System.out.printf("c2 circumference: %.2f%n", c2.getCircumference());

	}

}
