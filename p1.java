import java.util.*;
class Test{
	public static void main(String a[])
	{
		
		int i,temp;
		int b[]=new int[a.length];
		for(i=0;i<a.length;i++)
		{
			b[i]=Integer.parseInt(a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
