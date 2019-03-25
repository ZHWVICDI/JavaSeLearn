package com.qinhan.structure.template;

public class ProductQuery extends QueryTemplate {

	@Override
	protected void getResult() {
		// TODO Auto-generated method stub
		System.out.println("ProductQuery得到结果");

	}

	@Override
	protected void execute(String param1) {
		// TODO Auto-generated method stub
		System.out.println("ProductQuery执行查询");
	}

	@Override
	protected void checkArguments(String param1) {
		// TODO Auto-generated method stub
		System.out.println("ProductQuery检查参数");
	}

}
