package main;
import java.io.IOException;
import java.net.UnknownHostException;

import reseau.Client;


public class Main {
	public static void main (String [] args) {
		Thread thd;
		
		try {
			if(args.length == 0){
				System.out.println("Tentative de connection à localhost:5163");
				Client c = new Client("127.0.0.1","5163");
				thd = new Thread (c) ;
				thd.start();
				c.send("100:tyu;9");
			}else{
				new Client(args[0], args[1]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
