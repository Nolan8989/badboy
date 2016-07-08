package nolan.rmi.helloworld;

import java.rmi.Remote;
/**
 * implements了Remote接口的类或者其他接口中的方法若是声明抛出了RemoteException异常，
 * 则表明该方法可被客户端远程访问调用。 
 * @author ad
 *
 */
public class RmiData  implements Remote{

}
