import java.util.Scanner;
public class test {

	public static void main(String[] args) 
	{
		System.out.println("PROGRAMME DE COMPARAISON DES METHODES DE CALCUL RECURSIVE ET ITERATIVE DE LA SUITE DE FEBONNACCI\n");
		Scanner sc= new Scanner(System.in);
		febo A=new febo();    //A objet de type febo 
		
		int r�sultat,donn�e,compteur;
		long StartTime,FinalTime,ElapsedTime; 
		//pour comparer les deux m�thodes en terme de vitesse d'�xecution on utilise la m�thode nano time 
		System.out.println("veuillez entrez trois entiers positifs en ordre croissant(par exemple : 2,5,40) pour que la comparaison soit correcte");
		//
	  for(compteur=0;compteur<3;compteur++)
	   {
	    //On doit tester pour voir si l'entier est positif car la suite de febonnacci ne traite que des entiers positifs  
	    do
	    {
	    System.out.println("\nveuillez entrez l'entier positif num�ro "+(compteur+1));
	    donn�e=sc.nextInt();
	    }
	    while(donn�e<0);
	    
	    StartTime=System.nanoTime();
		r�sultat=A.r�cu(donn�e);
		FinalTime=System.nanoTime();
		ElapsedTime=FinalTime-StartTime;
		System.out.println("temps d'�xecution (m�thode r�cursive) = "+ElapsedTime+"nano secondes");
		System.out.println("le r�sultat est :"+r�sultat);
		
		StartTime=System.nanoTime();
		r�sultat=A.it�(donn�e);
		FinalTime=System.nanoTime();
		ElapsedTime=FinalTime-StartTime;
		
		System.out.println("temps d'�xecution (m�thode it�rative) = "+ElapsedTime+"nano secondes");
		System.out.println("le r�sultat est :"+r�sultat);
	   }
		
	}

}
