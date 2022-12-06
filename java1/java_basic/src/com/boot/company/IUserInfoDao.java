package com.boot.company;

// 선임개발자가 인터페이스를 설계해서
// A에겐 클라이언트 쪽 코딩을 맡김
// B에겐 DB쪽 연결코드 맡김
// 인터페이스를 통해서 코딩.
public interface IUserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	
	void updateUserInfo(UserInfo userInfo);
	
	void deleteUserInfo(UserInfo userInfo);
	
	void selectUserInfo(String id);
	
	
	
	
}
