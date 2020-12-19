package rmi;

import java.rmi.*;

/* Remote를 확장하여 원격 인터페이스 구성(아무 것도 구현할 필요 없는 표식용(mark) 인터페이스) */
/* 모든 원격 메서드를 정의할 때는 RemoteException 필수 */
public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
