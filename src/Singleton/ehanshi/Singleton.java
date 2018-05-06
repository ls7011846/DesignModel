package Singleton.ehanshi;

/**
 * Created by LS on 2018-5-6.
 * 饿汉式单例
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getinstance() {
        return singleton;
    }
}
