package Week9;

import java.util.*;


class PetStore {	
	public static void main(String args[]) {
		ArrayList<Pet> pets = new ArrayList<Pet>();
		Scanner scanner = new Scanner(System.in);
		String input;
		String name = "";
		Pet aPet = new Pet();
		String coatColor;
		String bearType;
		String gorillaSpecies;
		double weight;
		
		while (true) {
			System.out.print("Enter 'c' for cat, 'd' for dog, 'b' for bear, or 'g' for gorilla: ");
			input = scanner.next().toLowerCase();
			
			if (input.charAt(0) == 'c') {
				System.out.println("Enter the name of the cat (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the cat's coat color: ");
				coatColor = scanner.next();
				aPet = new Cat();
				((Cat) aPet).setCoatColor(coatColor);
			}
			else if (input.charAt(0) == 'd') {
				System.out.println("Enter the name of the dog (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the dog's weight: ");
				weight = scanner.nextDouble();
				aPet = new Dog();
				((Dog) aPet).setWeight(weight);

			}
			else if (input.charAt(0) == 'b'){
				System.out.println("Enter the name of the bear (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the bear's type (brown, black, polar, etc...): ");
				bearType = scanner.next();
				aPet = new Bear();
				((Bear) aPet).setBearType(bearType);
			}
			else if (input.charAt(0) == 'g'){
				System.out.println("Enter the name of the bear (or STOP to quit): ");
				name = scanner.next();
				if (name.equalsIgnoreCase("STOP"))
					break;
				System.out.println("Enter the gorilla's type (silverback, etc...): ");
				gorillaSpecies = scanner.next();
				aPet = new Gorilla();
				((Gorilla) aPet).setSpecies(gorillaSpecies);
			}
			else {
				System.out.println("Invalid choice.");
				continue;
			}
			
			aPet.setName(name);
			pets.add(aPet);
		}
		
		for (Pet pet : pets) {
			System.out.print(pet.getName() + " is a");
			if (pet instanceof Cat){
				System.out.println(" " + ((Cat)pet).getCoatColor() + " cat.");
			}
			else if (pet instanceof Dog){
				System.out.println(" dog that weights " + ((Dog)pet).getWeight() + " pounds.");
			}
			else if(pet instanceof Bear){
				System.out.println(" who is a " + ((Bear)pet).getBearType() + " bear.");
				System.out.println((pet).speak());
			}
			else if(pet instanceof Gorilla){
				System.out.println(" who is a " + ((Gorilla)pet).getSpecies() + " gorilla.");
				System.out.println((pet).speak());
			}
			else{
				System.out.println("n unknown animal.");
			}
		}
	}
}
