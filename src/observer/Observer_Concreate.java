package observer;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Observer_Concreate implements Observer {

	@Override
	public void update(String newstate) {
		System.out.println("观察到状态更新了");
	}

}
