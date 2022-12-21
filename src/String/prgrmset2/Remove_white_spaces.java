package String.prgrmset2;

public class Remove_white_spaces {

	public static void main(String[] args) {
		String x="Anil where are  you";
		x=x.replaceAll("[\\s]", "");
		System.out.println(x);
			

	}

}
