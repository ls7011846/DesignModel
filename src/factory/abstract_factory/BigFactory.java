package factory.abstract_factory;

import factory.simple_factory.Cookie;
import factory.simple_factory.Rice;

public class BigFactory implements AbstarctFactory {

	@Override
	public Cookie getCookie() {
		return new BigCookie();
	}

	@Override
	public Rice getRice() {
		return new BigRice();
	}

}
