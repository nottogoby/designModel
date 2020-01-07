package com.design.model.bulid.singleton;

/**
 * 懒汉式单例
 * 特点：类加载时不生成单例，只有第一次调用instance的时候会触发生成单例
 *
 * 缺点：每次调用instance时都要同步，会影响性能
 */
public class LazySingleton {

	private static volatile LazySingleton singleton = null;

	private LazySingleton(){}

	public static synchronized LazySingleton getInstance(){
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}

}
