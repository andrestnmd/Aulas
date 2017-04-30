package FigurasGeometricas;

public class Losango extends Poligono
{

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double Area() 
	{
		return base * altura;
		
	}

	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
