package com.design.model.bulid.prototype;

import java.util.Scanner;

public class Circle implements Shape{

	@Override
	public Object clone() {
		Circle circle = null;
		try {
			circle = (Circle) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return circle;
	}

	@Override
	public void countArea() {
		int r=0;
		System.out.print("这是一个圆，请输入圆的半径：");
		Scanner input=new Scanner(System.in);
		r=input.nextInt();
		System.out.println("该圆的面积="+3.1415*r*r+"\n");
	}
}
