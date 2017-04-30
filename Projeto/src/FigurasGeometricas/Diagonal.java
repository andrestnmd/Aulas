package FigurasGeometricas;

public interface Diagonal
{
	
	
	static double valor = 10;
	double area();

	default double diagonalQuadrado(double a)
	{
		return area() * Math.sqrt(2);
		
	}
	
	default double diagonalRetangulo(double a , double b)
	{
			return Math.sqrt((area() + area()) + (b * b));	
	}
	
	
	
}
