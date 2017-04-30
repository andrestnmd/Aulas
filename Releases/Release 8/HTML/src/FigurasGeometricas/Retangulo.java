package FigurasGeometricas;

public class Retangulo extends Poligono implements Diagonal 
{
	
	public Retangulo(double base , double altura)
	{
		super(base,altura);	
    }

	@Override
	public double Area() 
	{
		return base * altura;	
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

		
}
