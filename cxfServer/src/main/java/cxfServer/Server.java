//package cxfServer;
//
//import javax.xml.ws.Endpoint;
//
//import com.service.UserServiceImpl;
//
//public class Server {
//	protected Server() throws Exception{
//
//    System.out.println("Starting Server");
//    UserServiceImpl implementor = new UserServiceImpl();
//    String address = "http://127.0.0.1:8080/cxf/HelloWorld";
//    Endpoint.publish(address, implementor);
//}
//	public static void main(String args[]) throws Exception {
//	    new Server();
//	    System.out.println("Server ready...");
//	    Thread.sleep(10 * 60 * 1000);
//	    System.out.println("Server exiting");
//	    System.exit(0);
//	}
//}
