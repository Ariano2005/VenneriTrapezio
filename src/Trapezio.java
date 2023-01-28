
public class Trapezio {
	/*
	 * @author Ariano Venneri
	 * @titolo Trapezio
	 *  
	 */
	

	private double BaseMaggiore;
	private double baseminore;
	private double altezza;
	
	public Trapezio(double BMag, double bmin, double h) {
		this.BaseMaggiore = BMag;
		this.baseminore = bmin;
		this.altezza = h;
	}
	
	public void set(double BMag, double bmin, double h) {
		this.BaseMaggiore = BMag;
		this.baseminore = bmin;
		this.altezza = h;
	}
	
	public Trapezio get() {
		return this;
	}
	
	public double area() {
		return ((BaseMaggiore+baseminore)*altezza)/2;
	}
	
	
	public static void main(String[] args) {
		Trapezio t1 = new Trapezio(3, 2, 1);
		System.out.println(t1.area());

	}

}
