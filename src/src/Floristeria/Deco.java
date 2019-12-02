package src.Floristeria;

public class Deco extends Product {
	
	private String material;
		
	public Deco(String material, float precio) {
		super();
		this.material = material;
		this.setPrecio(precio);
	}
	public Deco() {
		
		
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "material=" + material + ", precio=" + getPrecio();
	}
	
	
	
	
	
	

}
