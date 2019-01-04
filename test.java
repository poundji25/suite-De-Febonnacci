import java.util.Scanner;
public class test {

	public static void main(String[] args) 
	{
		System.out.println("PROGRAMME DE COMPARAISON DES METHODES DE CALCUL RECURSIVE ET ITERATIVE DE LA SUITE DE FEBONNACCI\n");
		Scanner sc= new Scanner(System.in);
		febo A=new febo();    //A objet de type febo 
		
		int résultat,donnée,compteur;
		long StartTime,FinalTime,ElapsedTime; 
		//pour comparer les deux méthodes en terme de vitesse d'éxecution on utilise la méthode nano time 
		System.out.println("veuillez entrez trois entiers positifs en ordre croissant(par exemple : 2,5,40) pour que la comparaison soit correcte");
		//
	  for(compteur=0;compteur<3;compteur++)
	   {
	    //On doit tester pour voir si l'entier est positif car la suite de febonnacci ne traite que des entiers positifs  
	    do
	    {
	    System.out.println("\nveuillez entrez l'entier positif numéro "+(compteur+1));
	    donnée=sc.nextInt();
	    }
	    while(donnée<0);
	    
	    StartTime=System.nanoTime();
		résultat=A.récu(donnée);
		FinalTime=System.nanoTime();
		ElapsedTime=FinalTime-StartTime;
		System.out.println("temps d'éxecution (méthode récursive) = "+ElapsedTime+"nano secondes");
		System.out.println("le résultat est :"+résultat);
		
		StartTime=System.nanoTime();
		résultat=A.ité(donnée);
		FinalTime=System.nanoTime();
		ElapsedTime=FinalTime-StartTime;
		
		System.out.println("temps d'éxecution (méthode itérative) = "+ElapsedTime+"nano secondes");
		System.out.println("le résultat est :"+résultat);
	   }
		
	}

}
