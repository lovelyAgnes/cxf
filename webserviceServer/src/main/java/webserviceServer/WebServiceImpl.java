package webserviceServer;
//(name="WebServiceImpl", targetNamespace="http://webserviceServer.com/")
@javax.jws.WebService
public class WebServiceImpl implements WebService{

	@Override
	public String sayHello() {
		System.out.println("service server successful!");		
		return "hello world!";
	}

	@Override
	public String saygoodbye(String name) {
		// TODO Auto-generated method stub
		return "goodbye~ "+name;
	}

}
