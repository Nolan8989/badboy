package com.bjsxt.dao.impl;

import java.util.List;

import com.bjsxt.dao.ResidentDao;
import com.bjsxt.po.Resident;
import com.bjsxt.util.PageGoogle;

public class ResidentDaoImpl extends BaseDaoImpl  implements ResidentDao{

	@Override
	public int getResidentRowCount(String sql, Object[] params) {
		// TODO Auto-generated method stub
		Number number = (Number) this.getValue(sql, params);
		return number.intValue();
	}

	@Override
	public List findResidentAllPage(String sql, Object[] params, Class clazz) {
		// TODO Auto-generated method stub
		return this.getRowsFields(sql, params, clazz);
	}

	@Override
	public PageGoogle findRsd4PageData(String sql, Object[] params,
			Class clazz, int pageNum, int pageSize, int navNum) {
		// TODO Auto-generated method stub
		return this.pageTool(sql, params, clazz, pageNum, pageSize, navNum);
	}

	@Override
	public int addRsd(Resident rsd) {
		// TODO Auto-generated method stub
		return this.save(rsd);
	}

	
	
 

}
