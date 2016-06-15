package norlando.dao.impl;

import java.util.List;

import norlando.dao.FindAddrDao;
import norlando.po.Build;

public class FindAddrDaoImpl extends BaseDaoImpl implements FindAddrDao {

	@Override
	public List findAllBuilding() {
		// TODO Auto-generated method stub
		return this.getAllData(Build.class);
		}

	
}
