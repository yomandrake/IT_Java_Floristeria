package src.Floristeria;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
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

}
