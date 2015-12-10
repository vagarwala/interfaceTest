public class Rectangle extends Shape{
	private double width, length;

	public double getWidth(){
		return width;
	}
	public double getLength(){
		return length;
	}
	public void setWidth(double w){
		width = w;
	}
	public void setLength(double l){
		length = l;
	}
	public Rectangle(double w, double l){
		width = w; length = l;
	}
	public Rectangle(){
		width = 1.0; length = 1.0;
	}
	public String toString(){
		return "A Rectangle with width " + width + " and length " + length + ", which is a subclass of " + super.toString();
	}
	public double getArea(){
		return length*width;
	}
	public double getPerimeter(){
		return 2.0*(length + width);
	}
}