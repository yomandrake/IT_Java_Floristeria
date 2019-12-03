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
	public void setMaterial(int materialElegido) {
		switch (materialElegido){
		case 0:
			this.material = "madera";
			break;

		case 1:
			this.material = "plastico";
			break;
			
		default:
			this.material = "";
			break;
		
		}
		
	}
	
	@Override
	public String toString() {
		return "material=" + material + ", precio=" + getPrecio();
	}
	
	
	
	
	
	

}
