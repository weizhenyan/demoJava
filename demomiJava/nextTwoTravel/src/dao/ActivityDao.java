package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import entity.Activity;

public interface ActivityDao {
	//����ֹʱ�併�����л�б���ʾ���л
	List<Activity> getActList1()  throws SQLException;
	//���id�õ���Щ�
	List<Activity> getActList2(int act_id)  throws SQLException;
	//����ֹʱ�併�����л�б���������id�õ���Щ�
	List<Activity> getActList3(int act_user_id)  throws SQLException;
	//���ݳ���ģ����ѯ���Ϣ
	List<Activity> getActList4(String act_city)  throws SQLException;
	//����һ���µĻ
	int addAct(int act_user_id,String act_name,String act_desc,String act_city,int act_amount,int act_apply_amount,Date act_end_date) throws SQLException;	
	//ɾ���
	int delAct(int act_id) throws SQLException;
	//������ͨ����Ļ
	int updateAct(int act_id) throws SQLException;
}
