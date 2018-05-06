package factory.simple_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Rice extends Food{
	public Rice(){
		System.out.println("一份Rice。");
	}
}
