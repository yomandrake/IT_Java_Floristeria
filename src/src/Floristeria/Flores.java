package clases;

public class Flores {

	
	private String color;
	private float precio;
	public Flores(String color, float precio) {
		
		this.color = color;
		this.precio = precio;
	}
	public Flores() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "color=" + color + ", precio=" + precio;
	}
	
	
	
	
	
	

	

}
