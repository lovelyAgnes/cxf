package webserviceClient;

import java.io.IOException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import webserviceserver.WebServiceImpl;
import webserviceserver.WebServiceImplService;


public class WSClientTest {

	/**
	 * cmd导入
	 * wsimport -s E:\eclipse\workspace\webserviceClient\src\main\java -keep http://localhost:8022/WS_Server/Webservice?wsdl
	 * */
	/*public static void main(String[] args) {
		WebServiceImplService factory=new WebServiceImplService();
		WebServiceImpl wsImpl=factory.getWebServiceImplPort();
		String result=wsImpl.sayHello();
		System.out.println("调用webservice返回结果："+result);
		

	}*/
	
	 public static void main(String[] args) throws IOException { 
		 //创建WSDL文件的URL 
		 URL wsdlDocumentLocation=new URL("http://localhost:8022/WS_Server/Webservice?wsdl");
		 //创建服务名称 //1.namespaceURI - 命名空间地址 //2.localPart - 服务视图名 
		 QName serviceName=new QName("http://webserviceServer/","WebServiceImplService"); 
		 Service service=Service.create(wsdlDocumentLocation, serviceName); 
		 //获取服务实现类 
		 WebServiceImpl webServiceImpl=service.getPort(WebServiceImpl.class);
		 //调用方法 
		 String message=webServiceImpl.sayHello();
		 System.out.println("调用webservice返回结果:"+message); 
	 }
	
/*
 * public static void main(String[] args) { 
 * //创建服务视图，视图是从wsdl文件的service标签的name属性获取 
 * WeatherInterfaceImplService weatherInterfaceImplService=new WeatherInterfaceImplService(); 
 * //获取服务实现类，实现类从wsdl文件的portType的name属性获取 
 * WeatherInterfaceImpl weatherInterfaceImpl=weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class); 
 * //获取查询方法，从portType的operation标签获取 
 * String weather=weatherInterfaceImpl.queryWeather("北京"); 
 * System.out.println(weather); }
*/

}
