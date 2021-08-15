package Figuras_Geometricas;

public class Triangulo extends Poligono{
	
	public Triangulo(double altura, double base) {
		super(altura, base);
	}
	@Override
	public double getAltura() {
		return super.getAltura();
	}
	@Override
	public double getBase() {
		return super.getBase();
	}
	@Override
	public void setAltura(double altura) {
		super.setAltura(altura);
	}
	@Override
	public void setBase(double base) {
		super.setBase(base);
	}
	@Override
	public double area() {
		return getBase() * getAltura() / 2;
	}
	@Override
	public String toString() {
		return "-----Triangulo----\n"+
		        "[ Altura: "+ getAltura() +
		        " ]\n[ Base: "+ getBase() +
		        " ]\n[ Area: "+ area()+" ]";
	}
}
