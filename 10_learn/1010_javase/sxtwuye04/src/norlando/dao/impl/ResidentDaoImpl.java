package norlando.dao.impl;

import java.util.List;


import norlando.dao.ResidentDao;
import norlando.po.Resident;
import norlando.util.PageGoogle;


public class ResidentDaoImpl extends BaseDaoImpl implements ResidentDao {



	@Override
	public int getResidentRowsCount(String sql, Object[] params) {
		// TODO Auto-generated method stub
		Number number = (Number) this.getValue(sql, params);
		
		return number.intValue();
	}

	@Override
	public List getResdentLimitPage(String sql, Object[] params,
			Class<Resident> clazz) {
		// TODO Auto-generated method stub
		List resdentList = this.getRowsFields(sql, params, clazz);
		return resdentList;
	}

	@Override
	public PageGoogle findRsd4PageData(String sql, Object[] params,
			Class clazz, int num, int pageSize, int navNum) {
		// TODO Auto-generated method stub
		return this.getPesdentLimitPage(sql, params, clazz, pageSize, num, navNum);
	}

	

}
