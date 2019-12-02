package src.Floristeria;

public class Flower extends Product {

	
	private String color;

	public Flower(String color, float precio) {
		super();
		this.color = color;
		this.setPrecio(precio);
	}
	public Flower() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "color=" + color + ", precio=" + getPrecio();
	}
	
}
