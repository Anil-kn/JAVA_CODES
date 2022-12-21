package String.prgrmset2;

public class Compare2strings {

	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachi";
		int res=s1.compareTo(s2);
		if(res==0)
		{
			System.out.print("string are equal");
		}
		else if(res<0)
		{
			System.out.print("string s2 is greaterl");	
		}
		else
			System.out.print("string s1 is greater");
	}

}
