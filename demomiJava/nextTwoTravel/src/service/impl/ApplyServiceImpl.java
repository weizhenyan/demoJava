package service.impl;

import java.sql.SQLException;
import java.util.List;

import dao.ApplyDao;
import dao.impl.ApplyDaoImpl;
import entity.Apply;
import service.ApplyService;

public class ApplyServiceImpl implements ApplyService {
	ApplyDao dao=new ApplyDaoImpl();
	// ���ݽ�����id�õ�����������б�
	@Override
	public List<Apply> getActapList1(int apply_suser){
		try {
			return dao.getActapList1(apply_suser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	// ����������id�õ�����������б�
	@Override
	public List<Apply> getActapList2(int apply_fuser) {
		try {
			return dao.getActapList2(apply_fuser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}			
	}
	// ����һ���µĻ������
	@Override
	public int addActap(int apply_suser,int apply_fuser,int act_id) {
		try {
			return dao.addActap(apply_suser, apply_fuser,act_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return apply_fuser;
		}
		
	}
	//���ܻ������
	@Override
	public int acceptActap(int apply_id) {
		try {
			return dao.acceptActap(apply_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return apply_id;
		}
		
	}
	//�ܾ��������
	@Override
	public int rejectActap(int apply_id) {
		try {
			return dao.rejectActap(apply_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return apply_id;
		}
		
	}
}
