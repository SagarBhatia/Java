import java.util.*;
class Str{
	public static void main(String a[])
	{
		int i,n;
		
		System.out.println("Length: "+a[0].length());
		i=a[0].length()/2;
		System.out.println(i);
			String s=a[0].substring(i,a[0].length());
			System.out.println(s);
	}
}
