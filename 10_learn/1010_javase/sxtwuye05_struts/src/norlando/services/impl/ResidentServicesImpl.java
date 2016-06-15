package norlando.services.impl;

import java.util.List;


import norlando.dao.ResidentDao;
import norlando.dao.impl.ResidentDaoImpl;
import norlando.po.Resident;
import norlando.util.PageGoogle;

public class ResidentServicesImpl implements norlando.services.ResidentServices {

	private ResidentDao residentDao = new ResidentDaoImpl();
	@Override
	public int getResidentCount() {
		// TODO Auto-generated method stub
		String sql = "select count(*) from t_resident ";
		int rowCount = this.residentDao.getResidentRowsCount(sql,null);
		return rowCount;
	}
	@Override
	public List findResidentLimitPage(int startRow, int pageSize) {
		// TODO Auto-generated method stub
		String sql = "select * from t_resident limit ?,?";
		List residentList = this.residentDao.getResdentLimitPage(sql,new Object[]{startRow,pageSize},Resident.class);
		return residentList;
	}
	
	
	/**
	 * 封装的方法
	 */
	@Override
	public PageGoogle findResidentLimitPage(int pageSize, int num, int navNum) {
		// TODO Auto-generated method stub
		String sql = "select * from t_resident";
		PageGoogle page = this.residentDao.getPesdentLimitPage(sql,null,Resident.class, pageSize, num, navNum);
		return page;
	}
	
	
	
	@Override
	public PageGoogle findRsdByBuildAndDegree(int num, int degree,int buildid,int navNum) {
		// TODO Auto-generated method stub
		String sql = "select * from t_resident where build_id=? and degree=?";
		return this.residentDao.findRsd4PageData(sql, new Object[]{buildid,degree}, Resident.class, num, 5, navNum);
	}
	
	
	@Override
	public int addRsd(Resident res) {
		// TODO Auto-generated method stub
		
		return this.residentDao.save(res);
	}

}
