package org.whrhs.dlamson.eleven.pro.ch4;

import java.util.ArrayList;

public class LocalMap {
	private static int num = 10;

	public static void main(String[] args) {
		var map = new ArrayList<Integer>();
		for(var i = 0; i < num; i++) {
			map.add((int)(i*10*Math.random()));
			System.out.println(map.get(i));
		}
	}
}
