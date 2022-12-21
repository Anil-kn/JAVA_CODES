package programmes.programmes;

public class Power_of_num {

	public static void main(String[] args) {
		int base=3,exponent=3,result=1;
		while(exponent>0)//ex=3,re=1*3=3,ex=2
		{                      //re=9 ex=1
			result=result*base;// ex=1,re=9*3=27,ex=0.....
			exponent--;
			
		}
		System.out.println(result);
	}

}
