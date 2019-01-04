
public class febo
{

	//*cette méthode retourne le résultat de la suite de febonacci pour un entier donnée de façon récursive*//
public int récu(int n)
{
if(n==0||n==1)
	return 1;
else
return récu(n-1)+récu(n-2);	

}

//*cette méthode retourne le résultat de la suite de febonacci pour un entier donnée de façon itérative*//
public int ité(int n)
{
	int i,s=1,e=1,f=0;
	if(n==0)
	{
		return  1;
	}
	else
	{
		if(n==1)
		return  1;
		else
		{
			for(i=1;i<=n-1;i++)
			{
				f=e+s;
				s=e;
				e=f;
			}
		 return f;
		}
	

}
}





}