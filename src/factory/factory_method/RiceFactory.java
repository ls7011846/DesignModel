package factory.factory_method;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import factory.simple_factory.Rice;

public class RiceFactory {
	public Rice getRice() {
		return new Rice();
	}
}
