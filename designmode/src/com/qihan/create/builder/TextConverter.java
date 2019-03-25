package com.qihan.create.builder;

import com.qihan.create.builder.entity.Font;
import com.qihan.create.builder.entity.Paragraph;
//Builder   为创建一个Product对象的各个部件指定抽象接口(即创建不同的对象的行为) 
public interface TextConverter {
	public  char convertCharacter(char a);
	public Font convertFontChange(Font f);
	public Paragraph convertParagraph(Paragraph p);
}	
