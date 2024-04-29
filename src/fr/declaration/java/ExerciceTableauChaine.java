package fr.declaration.java;

public class ExerciceTableauChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nomVille = {"Paris","Lyon","Marseille","Strasbourg","Toulouse"};//declaration du tableau
		for(int i=0;i<nomVille.length;i++) {
			System.out.println(" "+i+" "+nomVille[i]);//afficher les noms des villes
		}//fin for()
		System.out.println("tableau de taille: "+nomVille.length);//afficher la longeur
		nomVille[3] = "Reims";//modifier la valeur de l'index 3
		//**System.out.println(">>"+nomVille[3]);
		
		 for(int i=0;i<nomVille.length;i++) {
			System.out.println(" "+i+" "+nomVille[i]);//afficher les noms des villes
		}//fin for()
		 
	}

}
