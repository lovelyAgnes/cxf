package webserviceServer;

import javax.xml.ws.Endpoint;

public class WebServicePublish {

	public static void main(String[] args) {
		//������ַ
		String address="http://172.26.5.150:8022/WS_Server/Webservice";
		//���̷߳���
		Endpoint.publish(address, new WebServiceImpl());
		//���̷߳���
		System.out.println("�����ɹ���");
			

	}

}
