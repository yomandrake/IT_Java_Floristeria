package src.Floristeria;

public class Tree extends Product {
		
	private float altura;

	public Tree(float altura, float precio) {
		super();
		this.altura = altura;
		this.setPrecio(precio);
	}
	public Tree() {
		
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "altura=" + altura + ", precio=" + getPrecio();
	}

}
