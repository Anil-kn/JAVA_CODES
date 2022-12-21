package String.prgrmset2;

public class Copystring {

	public static void main(String[] args) {
	String s="hello";
	String r=" ";
	for(int i=0;i<=s.length()-1;i++)
	{
		r=r+s.charAt(i);
	}
	System.out.print(r);
	}

}
