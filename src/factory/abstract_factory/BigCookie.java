package factory.abstract_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import factory.simple_factory.Cookie;

public class BigCookie extends Cookie {
	public BigCookie(){
		System.out.println("这是大份Cookie。");
	}
}
