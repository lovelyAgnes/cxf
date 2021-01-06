package webserviceServer;

import javax.xml.ws.Endpoint;

public class WebServicePublish {

	public static void main(String[] args) {
		//发布地址
		String address="http://172.26.5.150:8022/WS_Server/Webservice";
		//单线程发布
		Endpoint.publish(address, new WebServiceImpl());
		//多线程发布
		System.out.println("发布成功！");
			

	}

}
