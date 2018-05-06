package factory.simple_factory;

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
