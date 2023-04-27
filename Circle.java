public class Circle{
	
	private static double pi = 3.14;
	private int radius;

	public Circle(int radius){
		this.radius = radius;
	}

	public int getRadius(){
		return radius;
	}

	public void setRadius(int radius){
		this.radius = radius;
	}

	public double getArea(){
		return radius * radius * pi;
	}	

	public String toString(){
		return "This circle has a radius of: " + radius;
	}
}
