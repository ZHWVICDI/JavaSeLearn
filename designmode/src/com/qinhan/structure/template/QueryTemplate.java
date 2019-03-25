package com.qinhan.structure.template;

public abstract class QueryTemplate {
	public void query(String param1) {
		System.out.println("查询参数" + param1);

		checkArguments(param1);

		execute(param1);

		getResult();
		// 返回
	}

	// 得到执行结果
	protected abstract void getResult();

	// 执行查询
	protected abstract void execute(String param1);

	// 检查参数
	protected abstract void checkArguments(String param1);
}
