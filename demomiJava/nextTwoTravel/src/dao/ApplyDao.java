package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Apply;

public interface ApplyDao {
		// ���ݽ�����id�õ�����������б�
		List<Apply> getActapList1(int apply_suser) throws SQLException;
		// ����������id�õ�����������б�

		List<Apply> getActapList2(int apply_fuser) throws SQLException;
		// ����һ���µĻ������
		int addActap(int apply_suser,int apply_fuser,int act_id) throws SQLException;
		//���ܻ������
		int acceptActap(int apply_id) throws SQLException;	
		//�ܾ��������
		int rejectActap(int apply_id) throws SQLException; 
}
