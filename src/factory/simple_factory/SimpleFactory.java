package factory.simple_factory;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class SimpleFactory {
	public Food getFood(int type) {
		switch (type) {
		case 1:
			return new Rice();
		case 2:
			return new Cookie();
		default:  
            break;  
		}
		return null;
		
	}
}
