package cxfServer;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHi(String msg) {
		System.out.println("sayHi() ������...");
		return "hi!"+msg;
	}

}
