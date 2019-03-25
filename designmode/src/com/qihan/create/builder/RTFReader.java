package com.qihan.create.builder;

public class RTFReader {
//Director     构建一个使用Builder接口的对象  用于使用builder来创建一个对象。
	private ASCIIConverter as=null;
	private TexConverter tc=new TexConverter();
	private TextWidgetConverter twc=new TextWidgetConverter();
	
	
	
	public RTFReader(ASCIIConverter as) {
		this.as=as;
	}

	public void parseRTF(Text t) {
		for(int i=0;i<t.a.size();i++) {
			if(t.a.get(i) instanceof Character)
			as.convertCharacter((char) t.a.get(i));
		}
	}
}
