package factory.abstract_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import factory.simple_factory.Cookie;
import factory.simple_factory.Rice;

public interface AbstarctFactory {
	
	public Cookie getCookie();
	
	public Rice getRice();
	
}
