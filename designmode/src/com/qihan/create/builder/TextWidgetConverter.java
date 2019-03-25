package com.qihan.create.builder;

import com.qihan.create.builder.entity.Font;
import com.qihan.create.builder.entity.Paragraph;
import com.qihan.create.builder.entity.TextWidget;

public class TextWidgetConverter implements TextConverter {
	TextWidget tw=null;

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
	public TextWidget getTextWidget() {
		tw=new TextWidget();
		return tw;
	}
}
