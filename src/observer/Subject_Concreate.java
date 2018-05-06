package observer;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Subject_Concreate extends Subject {
	private String state;

	public String getState() {
		return state;
	}
	
	public void changestate(String newstate) {
		state = newstate;
		
		System.out.println("状态已经更新");
		//看一下加不加this有什么区别
		notify(newstate);
	}
}
