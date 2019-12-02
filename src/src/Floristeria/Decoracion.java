package clases;

public class Decoracion {
	
	private String material;
	private float precio;
	public Decoracion(String material, float precio) {
		
		this.material = material;
		this.precio = precio;
	}
	public Decoracion() {
		
		
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "material=" + material + ", precio=" + precio;
	}
	
	
	
	
	
	

}
