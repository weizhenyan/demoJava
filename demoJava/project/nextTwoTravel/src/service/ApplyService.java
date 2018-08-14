package service;

import java.sql.SQLException;
import java.util.List;

import entity.Apply;

/**
 * �������ӿ�
 * @author hxs
 *
 */
public interface ApplyService {
	// ���ݽ�����id�õ�����������б�
	List<Apply> getActapList1(int apply_suser);
	// ����������id�õ�����������б�
	List<Apply> getActapList2(int apply_fuser);
	// ����һ���µĻ������
	int addActap(int apply_suser,int apply_fuser,int act_id);
	//���ܻ������
	int acceptActap(int apply_id);	
	//�ܾ��������
	int rejectActap(int apply_id); 
}
