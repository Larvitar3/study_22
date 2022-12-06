package com.boot.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient2 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("a");

			// 파일안에 들어있는 문자열을 정수형으로 변환하여 출력한다.
//			System.out.println(	fis.read());
//			System.out.println(	fis.read());
//			System.out.println(	fis.read());
//			System.out.println(	fis.read());
//			System.out.println(	fis.read());
//			System.out.println(	fis.read());
//			System.out.println(	fis.read());
			
			System.out.println("파일을 잘 찾았습니다.");
			
			// fis 상태는 파일과 연결된 상태이기 때문에 접근해서 글자를 읽을 수 있다.
			// 글자들을 읽는 방법은 여러가지가 있다.
			
			Properties prop = new Properties();
			prop.load(fis);
			
			String dbType = prop.getProperty("DB_TYPE");
			
			IUserInfoDao dao;
			if(dbType.equals("ORACLE")) {
				dao = new UserInfoOracleDao();
			}else if(dbType.equals("MYSQL")) {
				dao = new UserInfoMySqlDao();
			}else {
				dao = new UserInfoMsSqlDao();
			}
			
			// 1. 저장하기
			// 스캐너를 통해 데이터를 받고
			UserInfo userInfo = new UserInfo("101", "abc", "김춘식");
			dao.insertUserInfo(userInfo);

			System.out.println("DB_TYPE : " + dbType);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("요청하신 파일이름이 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
