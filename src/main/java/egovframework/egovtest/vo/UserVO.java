package egovframework.egovtest.vo;

import java.io.Serializable;

public class UserVO implements Serializable {
	private static final long serialVersionUID = 1L; // (선택사항) 없어도 동작하지만 추가하면 더 좋습니다.
	// 간단 로그인 정보 
	private String id;
	private String pw;
	private String name;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
