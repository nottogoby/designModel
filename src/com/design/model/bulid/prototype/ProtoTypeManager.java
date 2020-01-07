package com.design.model.bulid.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 原型管理器
 */
public class ProtoTypeManager {

	private ConcurrentHashMap<String,Shape> map = new ConcurrentHashMap<>();

	private static ProtoTypeManager pm = new ProtoTypeManager();

	public ProtoTypeManager(){}

	public void addShape(String key, Shape obj){
		map.put(key,obj);
	}

	public Shape getShape(String key){
		return (Shape) (map.get(key)).clone();
	}

	public static ProtoTypeManager getInstance(){
		return pm;
	}

	public static void main(String[] args) {
		Map map1 = new HashMap();
		map1.put("1","1");
		Circle circle = new Circle();
		pm.addShape("circle",circle);
		Square square = new Square();
		pm.addShape("square",square);
		System.out.println(pm.getShape("circle") == pm.getShape("circle"));
	}
}
