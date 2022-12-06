package com.boot.company;

// UserInfoClient 코드를 개발하는 개발자는 인터페이스만 보고 코드를 구현 가능
public class UserInfoClient {

	// DBTYPE
	public static final String DB_TYPE = "ORCLE";

	public static void main(String[] args) {

		// 사용자한테 User 정보를 받습니다.
		UserInfo userInfo = new UserInfo("1", "1234", "김춘식");

		// 인터페이스 활용
		IUserInfoDao dao = new UserInfoMySqlDao();

		// 1. 만약 db type이 Mysql이면, Orcle이라면, MySql
		if (DB_TYPE.equals("MYSQL")) {
			dao = new UserInfoMySqlDao();
		} else if (DB_TYPE.equals("ORCLE")) {
			dao = new UserInfoOracleDao();
		} else {
			dao = new UserInfoMsSqlDao();
		}

		// 1. 사용자 정보 저장
		dao.insertUserInfo(userInfo);
		System.out.println("--------------");
		// 2. 사용자 정보 수정
		dao.updateUserInfo(userInfo);
		System.out.println("--------------");
		// 3. 사용자 정보 삭제
		dao.deleteUserInfo(userInfo);
		System.out.println("--------------");
		// 4. 사용자 정보 조회
		dao.selectUserInfo("abc");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
