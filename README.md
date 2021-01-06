# spring+cxf服务端项目和客户端项目
```java

<bean id="UIUserServiceImpl" class="com.uiservice.UIUserServiceImpl"/>	
	<jaxws:server id="IUIUserService" serviceClass="com.uiservice.IUIUserService" address="/user">
		<jaxws:serviceBean>
		<ref bean="UIUserServiceImpl"/>
		</jaxws:serviceBean>
	</jaxws:server>
  
  <servlet>
		<servlet-name>CXFService</servlet-name>
	  	<servlet-class>org.apache.cxf.transport.servlet.CXFServlet</servlet-class>
	  	<init-param>
            <param-name>config-location</param-name>
            <param-value>classpath:webservice.xml</param-value>
        </init-param>
	  	<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
	  	<servlet-name>CXFService</servlet-name>
	  	<url-pattern>/cxf/*</url-pattern>
	</servlet-mapping>
```
