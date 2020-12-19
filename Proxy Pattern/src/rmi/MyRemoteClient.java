package rmi;

import java.rmi.*;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		try {
			/* URL을 통해 서버에서 스터브 객체 가져와서 MyRemote형태로 캐스팅 */
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			
			String s = service.sayHello();
			
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
