package com.qinhan.create.prototype;

import java.util.Hashtable;

// 这个专门存储原型，将它们存储到一个Hashtable中
public class PrototypeCache {
	private static Hashtable<String,Prototype> prototypeMap=new Hashtable<String,Prototype>();
	
	public static Prototype getPrototype(String protypeId) {
		Prototype cachedPrototype=prototypeMap.get(protypeId);
		return cachedPrototype;
	}
}
