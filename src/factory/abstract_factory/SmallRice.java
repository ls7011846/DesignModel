package factory.abstract_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
import factory.simple_factory.Rice;

public class SmallRice extends Rice {
	public SmallRice (){
		System.out.println("这是小碗Rice。");
	}
}
