package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entity.Activity_message;

public interface ActivityMessageDao {
    
	// ͨ���id�õ��������,����������
	List<Activity_message> getActmsgList(int act_id)  throws SQLException;
	// ����һ���µĻ����
	int addActmsg(int act_id,int act_msg_fuser,String act_msg_acount) throws SQLException;
	//ɾ�������
	int delActmsg(int act_msg_id) throws SQLException;
}
