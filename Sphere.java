public class Sphere extends Circle{

    public Sphere(double radius, String name){
		super(radius,name);
    }

    public String toString(){
		return "Sphere "+getName()+" with radius of "+getRadius();
    }
}