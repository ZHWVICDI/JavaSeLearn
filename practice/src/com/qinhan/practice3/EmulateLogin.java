package com.qinhan.practice3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmulateLogin {
	static Map<String, User> userMap = new HashMap<String, User>();

	public static void main(String[] args) {

		userMap.put("zhw", new User("zhw", "123"));
		userMap.put("tyq", new User("tyq", "123"));
		userMap.put("h", new User("h", "123"));
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		String password = scanner.next();
		EmulateLogin em=new EmulateLogin();
		try {
			if (em.login(username,password)) {
				System.out.println("通过验证");
			}
		} catch (UserNotExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("请用户重新输入");
		}finally {
			scanner.close();
		}
	}

	public boolean login(String username, String password) throws UserNotExistException {
		User user = userMap.get(username);
		if (user == null) {
			throw new UserNotExistException("用户不存在");
		}
		if (user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

}
