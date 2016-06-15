package norlando.dao;



import norlando.basedao.BaseDao;
import norlando.entity.Role;

public interface RoleDao extends BaseDao<Role> {
	public int Sum();
}
