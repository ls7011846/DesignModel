package factory.factory_method;

import factory.simple_factory.Rice;

public class RiceFactory {
	public Rice getRice() {
		return new Rice();
	}
}
