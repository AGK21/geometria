
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CirculoTestAGK {
	
	private Circulo c;
	private double radio;
	static final double PI = 3.1416;

	//test 7
	@Test
	public void testArea1() {
		radio = 7;
		c = new Circulo(radio, "Circulo");
		double area = radio * radio * PI;
		assertEquals((int)area, (int)c.area());
	}
	
	
	@Test
	public void testPerimetro1() {
		radio = 7;
		c = new Circulo(radio, "Circulo");
		double perimetro = radio * 2 * PI;
		assertEquals((int)perimetro, (int)c.perimetro());
	}
	
	//test 0
		@Test
		public void testArea2() {
			radio = 0;
			c = new Circulo(radio, "Circulo");
			double area = radio * radio * PI;
			assertEquals((int)area, (int)c.area());
		}
		
		
		@Test
		public void testPerimetro2() {
			radio = 0;
			c = new Circulo(radio, "Circulo");
			double perimetro = radio * 2 * PI;
			assertEquals((int)perimetro, (int)c.perimetro());
		}
		
		//test -3
		@Test
		public void testArea() {
			radio = -3;
			c = new Circulo(radio, "Circulo");
			double area = radio * radio * PI;
			assertEquals((int)area, (int)c.area());
		}
		
		
		@Test
		public void testPerimetro() {
			radio = -3;
			c = new Circulo(radio, "Circulo");
			double perimetro = radio * 2 * PI;
			assertEquals((int)perimetro, (int)c.perimetro());
		}

}
