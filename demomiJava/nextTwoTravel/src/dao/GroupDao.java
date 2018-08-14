package dao;

import java.util.List;

public interface GroupDao {
	List getgrouplist();
	int deletegroup(int id);
	int addgroup();
	int updategroup(int id);

}
