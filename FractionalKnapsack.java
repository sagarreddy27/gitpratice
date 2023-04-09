import java.util.*;
public class FractionalKnapsack
{
	public static void knapsack(int n,int m, float w[],float p[])
	{
		float M,pr=0,wei=0;
		float we[]=new float[15];
		float x[]=new float[15];
		int i;
		M=m;
		for(i=0;i<n;i++)
		{
			if(we[i]>M)
				break;
			x[i]=1;
			M=M-we[i];
		}
		if(i<n)
			x[i]=M/we[i];
		System.out.println("\n the Solution Vector is...");
		for(i=0;i<n;i++)
			System.out.println("\n"+i+"\t"+x[i]);
		for(i=0;i<n;i++)
		{
			w[i]=we[i]*x[i];
			p[i]=p[i]*x[i];
		}
		for(i=0;i<n;i++)
		{
			pr=pr+p[i];
			wei=wei+we[i];
		}
		System.out.println("\n Maximum  Profit by Greedy Approach is:"+pr);
		System.out.println("\n Weight on Knapsack is"+wei);
	} 
	public static void main(String args[])
	{
		
		int n,size,i,j;
		float temp;
		Scanner inp=new Scanner(System.in);
		System.out.println("\nEnter no of elements and Capacity of Knapsack");
		n=inp.nextInt();
		size=inp.nextInt();
		
		float p[]=new float[n];
		float w[]=new float[n];
		float c[]=new float[n];
		
		System.out.println("\n Enter Weights and corresponding Profits:");

		for(i=0;i<n;i++)
		{
			w[i]=inp.nextFloat();
			p[i]=inp.nextFloat();
		}
		
		for(i=0;i<n;i++)
		{
			c[i]=p[i]/w[i];

		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(c[j]<c[j+1])
				{ 
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
					
					
					temp=w[j];
					w[j]=w[j+1];
					w[j+1]=temp;

					
					temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
				}
			} 		
		}
		System.out.println("\n Given problem can arranged as follows......");
		System.out.println("\n \tItems\tWeights\tprofits\tp/w");
		for(i=0;i<n;i++)
		{
			System.out.println("\n\t"+i+"\t"+w[i]+"\t"+p[i]+"\t"+c[i]);	
		}	
		knapsack(n,size,w,p);	
	}
}