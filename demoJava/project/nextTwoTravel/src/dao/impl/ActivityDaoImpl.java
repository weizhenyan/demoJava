package dao.impl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.ActivityDao;
import dbutil.DbUtil;
import entity.Activity;


public class ActivityDaoImpl implements ActivityDao {
	//����ֹʱ�併�����л�б���ʾ���л
	@Override
	public List<Activity> getActList1() throws SQLException {
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
		String sql = "SELECT * FROM activity "
				+ "ORDER BY act_end_date DESC";
		List list = (List) run.query(sql, new BeanListHandler(Activity.class));
		return list;
	}
	//���id�õ���Щ�
	@Override
	public List<Activity> getActList2(int act_id) throws SQLException {
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
		String sql ="SELECT * FROM activity "
				+ "WHERE act_id=? ORDER BY act_end_date DESC";
		Object[] params={act_id};
		List list = (List)run.query(sql, new BeanListHandler(Activity.class),params);
		return list;
	}
	//����ֹʱ�併�����л�б���������id�õ���Щ�
	@Override
	public List<Activity> getActList3(int act_user_id) throws SQLException {
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
		String sql ="SELECT * FROM activity "
				+ "WHERE act_user_id=? ORDER BY act_end_date DESC";
		Object[] params={act_user_id};
		List list = (List)run.query(sql, new BeanListHandler(Activity.class),params);
		return list;
	}
	//���ݳ���ģ����ѯ���Ϣ
	@Override
	public List<Activity> getActList4(String act_city)  throws SQLException {
		//����dbutils�µ�QueryRunnner
        QueryRunner runner = new QueryRunner(DbUtil.dataSource);
        //����ע��where 1=1����һ��Ҫ���ո񣬷���ͺ�������ַ���ƴ�Ӻ󣬵����ݿ��ѯ����ִ���
        String sql = "SELECT * FROM activity where 1=1  ";
        //����һ�����������洢��ѯ�Ĳ�������Ϊ���ǲ�����ͻ��������뼸�������������ü��������
        List<String> list = new ArrayList<String>();
        if (act_city != "") {
            //����û������act_city��Ϊ�գ�����Ҫ�����ַ���ƴ��
            sql += "and act_city like ? ";
            //���û�����Ĳ�����ӵ�����
            list.add("%" + act_city + "%");
        }
        //��󽫼���ת��������
        Object[] params = list.toArray();
        //����runner�����query��ѯ�������������Ϸ���
        return runner.query(sql, new BeanListHandler<Activity>(Activity.class), params);
	}
	//����һ���µĻ
	@Override
	public int addAct(int act_user_id, String act_name, String act_desc, String act_city, int act_amount,
			int act_apply_amount, Date act_end_date) throws SQLException {
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		String sql ="insert into activity values(null,?,?,?,?,?,?,now(),?)";	
		Object param[]={act_user_id,act_name,act_desc,act_city,act_amount,act_apply_amount,act_end_date};
		return run.update(sql,param);
	}
	//ɾ���
	@Override
	public int delAct(int act_id) throws SQLException {
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		String sql ="delete from activity where act_id=?";	
		Object param[]={act_id};
		return run.update(sql,param);
	}
	//������ͨ����Ļ
	@Override
	public int updateAct(int act_id) throws SQLException {
		QueryRunner run=new QueryRunner(DbUtil.dataSource);
		String sql ="UPDATE activity SET act_apply_amount=act_apply_amount+1 WHERE act_id=?";	
		Object param[]={act_id};
		return run.update(sql,param);
	}	
}
