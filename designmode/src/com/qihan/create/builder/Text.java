package com.qihan.create.builder;

import java.util.ArrayList;
import java.util.List;

import com.qihan.create.builder.entity.Font;
import com.qihan.create.builder.entity.Paragraph;

public class Text {
	Font f;
	Paragraph p;
	char c;
	List a=new ArrayList();
	public Text() {
		a.add(f);
		a.add(p);
		a.add(c);
	}
}
