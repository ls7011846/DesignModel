package factory.simple_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Cookie extends Food {
	public Cookie(){
		System.out.println("一份Cookie。");
	}
}
