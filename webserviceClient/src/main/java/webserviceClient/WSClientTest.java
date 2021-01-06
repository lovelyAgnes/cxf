package webserviceClient;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import webserviceserver.WebServiceImpl;
import webserviceserver.WebServiceImplService;


public class WSClientTest {

	/**
	 * cmd����
	 * wsimport -s E:\eclipse\workspace\webserviceClient\src\main\java -keep http://localhost:8022/WS_Server/Webservice?wsdl
	 * */
	/*public static void main(String[] args) {
		WebServiceImplService factory=new WebServiceImplService();
		WebServiceImpl wsImpl=factory.getWebServiceImplPort();
		String result=wsImpl.sayHello();
		System.out.println("����webservice���ؽ����"+result);
		

	}*/
	
	 public static void main(String[] args) throws IOException { 
		 //����WSDL�ļ���URL 
		 URL wsdlDocumentLocation=new URL("http://localhost:8022/WS_Server/Webservice?wsdl");
		 //������������ //1.namespaceURI - �����ռ��ַ //2.localPart - ������ͼ�� 
		 QName serviceName=new QName("http://webserviceServer/","WebServiceImplService"); 
		 Service service=Service.create(wsdlDocumentLocation, serviceName); 
		 //��ȡ����ʵ���� 
		 WebServiceImpl webServiceImpl=service.getPort(WebServiceImpl.class);
		 //���÷��� 
		 String message=webServiceImpl.sayHello();
		 System.out.println("����webservice���ؽ��:"+message); 
	 }
	
/*
 * public static void main(String[] args) { 
 * //����������ͼ����ͼ�Ǵ�wsdl�ļ���service��ǩ��name���Ի�ȡ 
 * WeatherInterfaceImplService weatherInterfaceImplService=new WeatherInterfaceImplService(); 
 * //��ȡ����ʵ���࣬ʵ�����wsdl�ļ���portType��name���Ի�ȡ 
 * WeatherInterfaceImpl weatherInterfaceImpl=weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class); 
 * //��ȡ��ѯ��������portType��operation��ǩ��ȡ 
 * String weather=weatherInterfaceImpl.queryWeather("����"); 
 * System.out.println(weather); }
*/

}
