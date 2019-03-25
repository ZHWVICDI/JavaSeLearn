package com.qinhan.practice;

public class Practice2 {
private static String[] items= {"牛奶","苹果"};
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		items[1]="";
		System.out.println("尝试购买苹果，并向得到信息");
		try {
			getItem(items[1]);
		} catch (ItemNullException e) {
			// TODO Auto-generated catch block
			System.out.println("这个物品竟然没有了，进货其他水果");
			items[1]="香蕉";
		}catch(Exception e) {
			throw new Exception();
		}
		getItem(items[1]);
		
		//模拟卖空
		System.out.println("下午"+items[0]+"和"+items[1]+"卖得很火爆");
		items[0]="";items[1]="";
		try {
			System.out.println("想知道今天的商品是否还存在");
			isEmpty(items);
		} catch (EmptyException e) {
			// TODO Auto-generated catch block
			System.out.println("今天的东西已经卖完了！客官明天再来吧");
		}
		
	}
	public static String getItem(String item) throws ItemNullException {
		if(item=="") {
			throw new ItemNullException(item+"物品已经没有了");
		}
		System.out.println(item+"还有存货");
		return item;
	}
	
	public static boolean isEmpty(String[] Items) throws EmptyException {
		for(String item:items) {
			if(item!="") {
				return false;
			}
		}
		throw new EmptyException("所有库存为空");
	}
}
