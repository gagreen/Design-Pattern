package rmi;

import java.rmi.*;
import java.rmi.server.*; // UnicastRemoteObject

/* 원격 객체로 만들기 위해 UnicastRemoteObject를 상속한다(가장 쉬운 방법) */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote { 

	/* super클래스 생성자에서 RemoteException을 던지기 때문에 필요 */
	public MyRemoteImpl() throws RemoteException{}
	
	@Override
	public String sayHello() {
		return "Server says, 'Hey~'";
	}

	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl(); // 원격 객체의 인스턴스 생성
			Naming.rebind("RemoteHello", service); // rebind라는 정적 메서드를 사용해 rmiregistry에 결합시킴
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
