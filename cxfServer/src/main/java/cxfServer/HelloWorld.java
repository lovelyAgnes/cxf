package cxfServer;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	String sayHi(@WebParam(name="msg") String msg);
}
