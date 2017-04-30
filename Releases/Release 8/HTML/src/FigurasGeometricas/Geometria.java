package FigurasGeometricas;

import java.util.ArrayList;

public class Geometria
{
	
	public static void main(String[] args)
	{

ArrayList<Figura> figuras = new ArrayList<>();
figuras.add(new Retangulo(2.0,2.0));
figuras.add(new Quadrado(2.0,2.0));
figuras.add(new Triangulo(2.0,2.0));
figuras.add(new Losango(2.0,2.0));

for(Figura fig :figuras)
{
	System.out.println("Area:Quadrado , Circulo , Triangulo , Losango" +
    fig.Area());
	System.out.println("Perimetro:Quadrado , Circulo , Triangulo , Losango" +
    fig.Perimetro());

	
	
}
		
	
	}
}