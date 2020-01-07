package com.design.model.bulid.singleton;

/**
 * 饿汉式单例
 * 特点：类一旦加载就完成实例化，instance调用之前此单例就已经存在
 */
public class HungrySingleton {

	private static final HungrySingleton singleton = new HungrySingleton();

	private HungrySingleton(){}

	public static HungrySingleton getInstance(){
		return singleton;
	}

}
