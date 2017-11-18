package FigurasGeometricas;

public class Circulo extends Figura {

	public Circulo(double d, double e) {

	}

	public double Figura() {

		return 0;
	}

	public double diametro()
	{
		
		double diametro = 3.14;
		return 2 * diametro;
	}

	
	@Override
	public double Area() {

		return diametro() * 3.14 ;
	}

	@Override
	public double Perimetro() {
		
		return Area() * diametro() + 4;
	}

}
