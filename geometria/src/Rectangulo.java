
/**
 * @author tony gibbs
 * @version 1.2
 *
 */

public class Rectangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	
	

	/**
	 * 
	 * @param define forma y que el lado 1 es el grande
	 * @param y el dos el pequeño
	 */
	public Rectangulo(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 *@return devuelve el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	
	
	
	/**
	 *@return devuelve el perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
