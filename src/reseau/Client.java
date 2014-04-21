package reseau;



import java.net.Socket ;
import java.net.UnknownHostException;
 
import java.io.PrintWriter ;
import java.io.OutputStreamWriter;
import java.io.IOException ;
 
 
public class Client implements Runnable {
 
 
	private String addr;
	private String port;
	private PrintWriter out;
	private	Socket socket;
	
 
	public Client(String addr, String port) throws NumberFormatException, UnknownHostException, IOException{
		this.addr = addr;
		this.port = port;
	
		socket = new Socket (addr , Integer.parseInt(port));
		socket.setSoLinger(true , 10);
		
		out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true );
		
		
	 
	
		
	 
			
	}//Client
	
	public String getAddr() {
		return addr;
	}

	public String getPort() {
		return port;
	}
	
	public void run (){
		
		while (true){
			try {
				
	//-----------------------------------------------------------------------------------
				int t;
				String tmp="" ;
				do {
					t = socket.getInputStream().read();
					if(t != 10)
						tmp = tmp + (char)t;
				}while (t!=10) ;
				
	//-----------------------------------------------------------------------------------
					System.out.println(tmp);
			}//try
			catch (IOException a ) {
				System.out.println("erreur4") ;
				a.printStackTrace() ;  }//catch IO
		}//while
		
	}

	public void send(String mes){
		
		//System.out.println(System.in.read());
		out.println(mes);
		out.flush();	
		//	out2.writeBytes(System.in.read() + "\n");
			
		
	}
	
	
 
}//class

/**/
