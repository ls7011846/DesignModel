package observer;
/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Test {
	public static void main(String[] args) {
		Subject_Concreate sc = new Subject_Concreate();
		
		Observer_Concreate oc1 = new Observer_Concreate();
		Observer_Concreate oc2 = new Observer_Concreate();
		
		sc.attach(oc1);
		sc.attach(oc2);
		
		sc.changestate("现在是第一");
		
		sc.changestate("现在是第二");
 	}
}
