package dao;

import java.util.List;

public interface PermissionDao {
	List getpermissionlist();
	int addpermission();
	int deletepermission(int id);
	int updatepermission(int id);

}
