public class Voyage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TEST 1
		System.out.println("Test partie 1 : ");
		System.out.println("----------------");
		OptionVoyage option1 = new OptionVoyage("Sejour au camping", 40.0);
		System.out.println(option1.toString());

		OptionVoyage option2 = new OptionVoyage("Visite guidee : London by night" , 50.0);
		System.out.println(option2.toString());
		System.out.println();

		//FIN TEST 1 */
	
		/*		// TEST 2
		System.out.println("Test partie 2 : ");
		System.out.println("----------------");
		Transport transp1 = new Transport("Trajet en car ", 50.0);
		System.out.println(transp1.toString());
		Transport transp2 = new Transport("Croisiere", 1300.0);
		System.out.println(transp2.toString());
		Sejour sejour1 = new Sejour("Camping les flots bleus", 20.0, 10, 30.0);
		System.out.println(sejour1.toString());
		System.out.println();
		//FIN TEST 2 */

		
		/*		 //TEST 3
		System.out.println("Test partie 3 : ");
		System.out.println("----------------");
		KitVoyage kit1 = new KitVoyage("Zurich", "Paris");
		kit1.ajouterOption(new Transport("Trajet en train", 50.0));
		kit1.ajouterOption(new Sejour("Hotel 3* : Les amandiers ", 40.0, 5, 100.0));
		System.out.println(kit1.toString());
		System.out.println();		
		kit1.annuler();
		
		KitVoyage kit2 = new KitVoyage("Zurich", "New York");
		kit2.ajouterOption(new Transport("Trajet en avion", 50.0, true));
		kit2.ajouterOption(new Sejour("Hotel 4* : Ambassador Plazza  ", 100.0, 2, 250.0));
		System.out.println(kit2.toString());
		kit2.annuler();
		
		//FIN TEST 3 */
		  
	}
}