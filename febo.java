
public class febo
{

	//*cette m�thode retourne le r�sultat de la suite de febonacci pour un entier donn�e de fa�on r�cursive*//
public int r�cu(int n)
{
if(n==0||n==1)
	return 1;
else
return r�cu(n-1)+r�cu(n-2);	

}

//*cette m�thode retourne le r�sultat de la suite de febonacci pour un entier donn�e de fa�on it�rative*//
public int it�(int n)
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