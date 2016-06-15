package norlando.servies.impl;

import java.util.List;

import com.bjsxt.po.Resident;

import norlando.dao.ResidentDao;
import norlando.dao.impl.ResidentDaoImpl;
import norlando.util.PageGoogle;

public class ResidentServicesImpl implements norlando.services.ResidentServices {

	private ResidentDao residentDao = new ResidentDaoImpl();
	@Override
	public int getResidentCount() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from to_resident ";
		int rowCount = this.residentDao.getResidentRowsCount(sql,null);
		return rowCount;
	}
	@Override
	public List findResidentLimitPage(int startRow, int pageSize) {
		// TODO Auto-generated method stub
		String sql = "select * from to_resident limit ?,?";
		List residentList = this.residentDao.getResdentLimitPage(sql,new Object[]{startRow,pageSize},Resident.class);
		return residentList;
	}
	
	
	/**
	 * 封装的方法
	 */
	@Override
	public PageGoogle findResidentLimitPage(int pageSize, int num, int navNum) {
		// TODO Auto-generated method stub
		String sql = "select * from to_resident";
		PageGoogle page = this.residentDao.getPesdentLimitPage(sql,null,Resident.class, pageSize, num, navNum);
		return page;
	}

}
