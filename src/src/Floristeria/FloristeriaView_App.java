package src.Floristeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FloristeriaView_App {
	
	List<Floristeria> myFloristerias = new ArrayList<>();
	
		public void main(Scanner sc) {		
			
			
			boolean executeMain = true;
			char userChoice;
			
			do{
				System.out.println("\nHola Bienvenido a la fabrica de floristerias: "
						+ "\n\t 1-Crear una floristeria "
						+ "\n\t 2-Editar floristerias creadas"
						+ "\n\t 0-Salir de la aplicacion");
				System.out.print("Opcion: ");
				userChoice = sc.next().charAt(0);
				
				switch(userChoice) {	
					case '1':
						System.out.print("\t Has elegido registrar una Floristeria nueva"
								+"\n\t Introduce el nombre = ");
						String newShopName = sc.next();
						myFloristerias.add(new Floristeria(newShopName));					
						break;

					case '2':
						System.out.println("Las floristerias que existen son: ");
						//myFloristerias.forEach(floristeria -> System.out.println(floristeria.getShopName()));
						
						for (int i = 0; i < myFloristerias.size(); i++) {
							System.out.println(i + " - " + myFloristerias.get(i).getShopName());
							
						}
						
						System.out.print("Introduce el numero de floristeria que desea editar= ");
						int floristeriaElegida = sc.nextInt();
						this.editFloristeria(floristeriaElegida, sc);					
						
						break;

					case '0':
						executeMain = false;
						break;
					
					default:
						System.out.println("Intenta otra vez.....");
						break;
					
				
				}
				
			}while(executeMain);
			
			
			if(userChoice == '1') {
				
			}else if(userChoice == '2') {
				
			}else {
				
			}
					
			
		}

		private void editFloristeria(int floristeriaElegida,Scanner sc) {
			boolean editing = true;
			
			do {
				System.out.println("\t1-Agregar Arbol"
						+ "\n\t2-Agregar Flor"
						+ "\n\t3-Agregar Deco"
						+ "\n\t4-Conocer el Stock"
						+ "\n\t5-Salir de la floristeria");
				System.out.print("\tElige la opcion deseada = ");
				int userChoice = sc.nextInt();
				
				switch(userChoice) {
				case 1://Add tree
					Tree newTree = new Tree();
					System.out.print("\tAltura(Recordar ,00)= ");
					newTree.setAltura((float) sc.nextFloat());
					System.out.print("\tPrecio(Recordar ,00)= ");
					newTree.setPrecio((float) sc.nextFloat());
					this.myFloristerias.get(floristeriaElegida).getTreeStock().add(newTree);
					
					System.out.println("Has agregado en "+this.myFloristerias.get(floristeriaElegida).getShopName()
							+ "el siguiente arbol: "+ newTree.toString());
					
					break;

				case 2://Add Flower
					Flower newFlower = new Flower();
					
					System.out.print("\tColor= ");
					newFlower.setColor(sc.next());
					
					System.out.print("\tPrecio(Recordar ,00)= ");
					newFlower.setPrecio((float) sc.nextFloat());
					this.myFloristerias.get(floristeriaElegida).getFlowerStock().add(newFlower);
					
					System.out.println("Has agregado en "+this.myFloristerias.get(floristeriaElegida).getShopName()
							+ "la siguiente flor: "+ newFlower.toString());
					
					break;

				case 3://Add Deco

					Deco newDeco = new Deco();
					
					System.out.print("\tMaterial (0-Madera o 1=Plastico)= ");
					newDeco.setMaterial(sc.nextInt());
					System.out.print("\tPrecio(Recordar ,00)= ");
					newDeco.setPrecio((float) sc.nextFloat());
					this.myFloristerias.get(floristeriaElegida).getDecoStock().add(newDeco);
					
					System.out.println("Has agregado en "+this.myFloristerias.get(floristeriaElegida).getShopName()
							+ "la siguiente decoracion: "+ newDeco.toString());
					
					break;
				
				case 4://Conocer el Stock
					this.myFloristerias.get(floristeriaElegida).showAllStock();
					break;
					
				case 5://Exit
					editing = false;
					System.out.println("Has terminado de editar la floristeria");
					break;
					
				default:
					break;
				}
							
			}while(editing);
			
		}

	}

	

