package service;

public class TestService {

	public static void main(String[] args) {
		SaveUserInfoMgr saveMgr = new SaveUserInfoMgr();
//		for(int i=1;i<=3;i++)
//		   saveMgr.saveUserInfo("test"+i, "123456", "小明"+i);
		DeleteUserInfoMgr deleteMgr = new DeleteUserInfoMgr();
		deleteMgr.deleteUserInfo("cde@scholat.com");
//		UpdateUserInfoMgr updateMgr = new UpdateUserInfoMgr();
//		updateMgr.updateUserInfo("chencheng", "654321", "小新");
		
	}
}
