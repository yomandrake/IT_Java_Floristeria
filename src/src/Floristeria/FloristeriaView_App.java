package src.Floristeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloristeriaView_App {
	
		public void main(Scanner sc) {
			
			
			List<Floristeria> myFloristerias = new ArrayList<>();
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
						editFloristeria(floristeriaElegida,sc);					
						
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

		private static void editFloristeria(int floristeriaElegida,Scanner sc) {
			boolean editing = true;
			
			do {
				System.out.println("1-Agregar Arbol"
						+ "\n2-Agregar Flor"
						+ "\n3-Agregar Deco"
						+ "\n4-Salir de la floristeria");
				System.out.print("\tElige la opcion deseada = ");
				int userChoice = sc.nextInt();
				
				switch(userChoice) {
				case 1://Add tree
					Tree newTree = new Tree();
					System.out.println("\tAltura(Recordar .00)= ");
					newTree.setAltura((float) sc.nextFloat());
					System.out.println("\tPrecio(Recordar .00)= ");
					newTree.setPrecio((float) sc.nextFloat());
					
					
					
					break;

				case 2://Add Flower
					
					break;

				case 3://Add Deco
					
					break;
				
				case 4://Exit
					editing = false;
					break;
					
				default:
					break;
				}
							
			}while(editing);
			
		}

	}

	

