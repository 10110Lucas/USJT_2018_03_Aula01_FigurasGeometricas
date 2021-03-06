package Figuras_Geometricas;

public class Circulo extends Figura{
	
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double area(){
		return Math.PI * Math.pow(raio, 2);
	}
	@Override
	public String toString() {
		return "-----Circulo------\n"+
	               "[ Raio: "+ raio +
	               " ]\n[ Area: "+ area()+" ]";
	}
	
}
