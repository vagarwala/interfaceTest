public class Sphere extends Circle{

    public Sphere(double radius, String name){
		super(radius,name);
    }

    public String toString(){
		return "Sphere "+getName()+" with radius of "+getRadius();
    }
    public double getVolume(){
    	return 4/3 * Math.PI * getRadius() * getRadius() * getRadius();
    }
}