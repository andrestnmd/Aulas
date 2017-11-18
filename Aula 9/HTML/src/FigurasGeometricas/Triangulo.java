package FigurasGeometricas;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double Area() 
	{
		return (base * altura) / 2;
	}

	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
