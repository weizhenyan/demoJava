package service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entity.Activity_message;

/**
 * ���Ϣ����ӿ�
 * @author hxs
 *
 */
public interface ActivityMessageService {
	// ͨ���id�õ��������,����������
	List<Activity_message> getActmsgList(int act_id);
	// ����һ���µĻ����
	int addActmsg(int act_id,int act_msg_fuser,String act_msg_acount);
	//ɾ�������
	int delActmsg(int act_msg_id);
}
