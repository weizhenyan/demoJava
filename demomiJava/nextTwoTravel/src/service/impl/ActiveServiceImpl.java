package service.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import dao.ActivityDao;
import dao.impl.ActivityDaoImpl;
import entity.Activity;
import service.ActivityService;

public class ActiveServiceImpl implements ActivityService {
		ActivityDao dao=new ActivityDaoImpl();
		//����ֹʱ�併�����л�б���ʾ���л
		@Override
		public List<Activity> getActList1() {		
			try {
				return dao.getActList1();
			} catch (SQLException e) {
				return null;
			}		
		}
		//���id�õ���Щ�
		@Override
		public List<Activity> getActList2(int act_id) {
			try {
				return dao.getActList2(act_id);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			
		}
		//����ֹʱ�併�����л�б���������id�õ���Щ�
		@Override
		public List<Activity> getActList3(int act_user_id) {
			try {
				return dao.getActList3(act_user_id);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			
		}
		//����һ���µĻ
		@Override
		public int addAct(int act_user_id, String act_name, String act_desc, String act_city, int act_amount,
				int act_apply_amount, Date act_end_date) {
			if(act_name == null||act_desc == null||act_city == null||act_amount == 0||act_end_date == null){
				throw new RuntimeException("�û�������Ϊ��");
			}
			try {
				dao.addAct(act_user_id, act_name, act_desc, act_city, act_amount, act_apply_amount, act_end_date);
				return 1;
			} catch (SQLException e) {
				return 0;
			}						
		}
		//ɾ���
		@Override
		public int delAct(int act_id) {
			try {
				return dao.delAct(act_id);
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
			
		}
		//������ͨ����Ļ
		@Override
		public int updateAct(int act_id) {
			try {
				return dao.updateAct(act_id);
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
			
		}//���ݳ���ģ����ѯ���Ϣ
		@Override
		public List<Activity> getActList4(String act_city) {
			try {
				return dao.getActList4(act_city);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

}
