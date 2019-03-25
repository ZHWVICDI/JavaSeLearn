package com.qihan.create.builder;

import com.qihan.create.builder.entity.ASCIIText;
import com.qihan.create.builder.entity.Font;
import com.qihan.create.builder.entity.Paragraph;
//ConcreteBuilder    包含创建和装配一个特定产品的所有代码
//实现Builder的接口 来构造和装配产品的各个部件      这里的convertCharacter方法就是这样
//定义并明确它创建的表示
//提供一个检索产品的接口(例如：这里的GetASIIText()方法)
public class ASCIIConverter implements TextConverter {
	ASCIIText asiiText=null;

	@Override
	public char convertCharacter(char a) {
		// TODO Auto-generated method stub
		System.out.println("转换"+a+" 为ASCII编码");
		return a;
	}

	@Override
	public Font convertFontChange(Font f) {
		// TODO Auto-generated method stub
		System.out.println("转换"+f+"  Font");
		return f;
	}

	@Override
	public Paragraph convertParagraph(Paragraph p) {
		System.out.println("转换"+p+"  paragraph");
		return p;
		// TODO Auto-generated method stub
	}
	
	public ASCIIText GetASCIIText() {
		//?这里可以调用方法，然后返回一个asiiText对象
		asiiText=new ASCIIText();
		return asiiText;
	}
	

}
