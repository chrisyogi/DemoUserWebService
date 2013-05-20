package bean;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class JavaBeanWSTestor {

	public static void main(String[] args) throws ServiceException,MalformedURLException, RemoteException{
		String endpoint = "http://localhost:8080/UserWebService/services/ckp";
		Service service = new Service();
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.setOperationName("sayHello");
		String res = (String)call.invoke(new Object[]{});
		System.out.println(res);
		
	}
}
