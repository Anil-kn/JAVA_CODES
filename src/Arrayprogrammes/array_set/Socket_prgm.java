package Arrayprogrammes.array_set;
import java.net.InetAddress; 
public class Socket_prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		try{    
		InetAddress ip=InetAddress.getByName("195.201.10.8");    
		  
		System.out.println("Host Name: "+ip.getHostName());    
		}catch(Exception e){System.out.println(e);}    
		} 
	}


