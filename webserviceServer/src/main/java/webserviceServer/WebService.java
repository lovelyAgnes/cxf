package webserviceServer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

//@javax.jws.WebService
//�淶Ҫ�󣬿���Զ�̽ӿں�ʵ����
@javax.jws.WebService
//(name="WebService", targetNamespace="http://webserviceServer.com/")
public interface WebService {
	//@WebMethod
	//@WebResult(name="service", targetNamespace="http://webserviceServer.com/")
	String sayHello();
	String saygoodbye(@WebParam String name);
}
