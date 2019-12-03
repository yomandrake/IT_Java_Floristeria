package src.Floristeria;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {

	private String shopName;
	private List<Tree> treeStock = new ArrayList<>();
	private List<Flower> flowerStock = new ArrayList<>();
	private List<Deco> decoStock = new ArrayList<>();
	

	public Floristeria(String shopName) {
		this.shopName = shopName;		
	}
	
	
	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	public List<Tree> getTreeStock() {
		return treeStock;
	}


	public void setTreeStock(List<Tree> treeStock) {
		this.treeStock = treeStock;
	}


	public List<Flower> getFlowerStock() {
		return flowerStock;
	}


	public void setFlowerStock(List<Flower> flowerStock) {
		this.flowerStock = flowerStock;
	}


	public List<Deco> getDecoStock() {
		return decoStock;
	}


	public void setDecoStock(List<Deco> decoStock) {
		this.decoStock = decoStock;
	}


	
	public void showAllStock() {
		System.out.println("Productos en Stock:");
		
		System.out.println("Arboles: ");
		for (Tree tree : this.treeStock) {
			System.out.println(tree.toString());
		}		
		System.out.println("Flores: ");
		for (Flower flower : this.flowerStock) {
			System.out.println(flower.toString());
		}
		
		System.out.println("Decoracion: ");
		for (Deco deco : this.decoStock) {
			System.out.println(deco.toString());
		}
		
	}
	
	
	
}
