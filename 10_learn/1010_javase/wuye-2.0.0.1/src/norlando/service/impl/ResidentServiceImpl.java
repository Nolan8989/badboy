package norlando.service.impl;

import java.util.List;

import norlando.dao.ResidentDao;
import norlando.dao.impl.ResidentDaoImpl;
import norlando.po.Resident;
import norlando.service.ResidentService;
import norlando.util.PageGoogle;


public class ResidentServiceImpl implements ResidentService{
	private static ResidentDao residentDao  = new ResidentDaoImpl();
	@Override
	public int getResidentCount() {
		// TODO Auto-generated method stub
		int rowCount = residentDao.getResidentRowCount("select count(*) from t_resident", null);
		return rowCount;
	}
	@Override
	public List findResidentAllPage(int startRow, int pageSize) {
		// TODO Auto-generated method stub
		List list = residentDao.findResidentAllPage("select * from t_resident limit ?,?", new Object[]{startRow,pageSize},Resident.class	);
		return list;
	}
	@Override
	public PageGoogle findRsdByBuildAndDegree(int num, int degree, int buildid,
			int navNum) {
		// TODO Auto-generated method stub
		return residentDao.findRsd4PageData("select * from t_resident where build_id=? and degree=?", new Object[]{buildid,degree}, Resident.class, num, 5, navNum);
	}
	@Override
	public int addRsd(Resident rsd) {
		// TODO Auto-generated method stub
		return residentDao.addRsd(rsd);
	}

}
