package service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entity.Activity;

/**
 * �����ӿ�
 * @author hxs
 *
 */
public interface ActivityService {
	//����ֹʱ�併�����л�б���ʾ���л
	List<Activity> getActList1();
	//���id�õ���Щ�
	List<Activity> getActList2(int act_id);
	//����ֹʱ�併�����л�б���������id�õ���Щ�
	List<Activity> getActList3(int act_user_id);
	//���ݳ���ģ����ѯ���Ϣ
	List<Activity> getActList4(String act_city);
	//����һ���µĻ
	int addAct(int act_user_id,String act_name,String act_desc,String act_city,int act_amount,int act_apply_amount,Date act_end_date);	
	//ɾ���
	int delAct(int act_id);
	//������ͨ����Ļ
	int updateAct(int act_id);
}
