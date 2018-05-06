package factory.abstract_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import factory.simple_factory.Cookie;

public class SmallCookie extends Cookie {
	public SmallCookie(){
		System.out.println("这是小份Cookie。");
	}
}
