package clases;

public class Arbres {
	

	
	private float altura;
	private float precio;
	public Arbres(float altura, float precio) {
		
		this.altura = altura;
		this.precio = precio;
	}
	public Arbres() {
		
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "altura=" + altura + ", precio=" + precio;
	}

}
