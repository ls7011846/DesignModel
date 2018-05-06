package factory.abstract_factory;

import factory.simple_factory.Cookie;
import factory.simple_factory.Rice;

public interface AbstarctFactory {
	
	public Cookie getCookie();
	
	public Rice getRice();
	
}
