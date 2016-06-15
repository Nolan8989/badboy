package norlando.dao.impl;

import java.util.List;

import com.bjsxt.po.Resident;

import norlando.dao.ResidentDao;


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

	

}
