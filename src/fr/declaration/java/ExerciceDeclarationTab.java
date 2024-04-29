package fr.declaration.java;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {8,-7,12,1,-2,14,17,9};//declaration du tableau tab
		System.out.println("tab 0: "+tab[0]);//afficher l'indice 0
		System.out.println("taille: "+tab.length);//afficher la taille du tableau
		System.out.println("val: "+tab[tab.length-1]);//afficher le dernier indice
		System.out.println("indice 10: "+tab[9]);//car tab.length = 7, et 10<7
		
	}

}
