package task10;

public class Circle {
	
	    private double radius;

	    public Circle() {
	        this.radius = 1.0; 
	    }

	    public  Circle(double radius) {
	        this.radius = radius;
	    }

	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public static void main(String[] args) {

	        Circle circle1 = new Circle();
	        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
	        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

	        Circle circle2 = new Circle(5.0);
	        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
	        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
	    }
	}

	
	

