package norlando.services;

import java.util.List;

import norlando.po.Resident;
import norlando.util.PageGoogle;

public interface ResidentServices {
	
	
	/**
	 * 得到Resident数量
	 * @return
	 */
	int getResidentCount();
	
	/**
	 * 分页查找Resident
	 * @param startRow 启示行
	 * @param pageSize	每页数量
	 * @return
	 */
	List findResidentLimitPage(int startRow, int pageSize);

	PageGoogle findResidentLimitPage(int pageSize, int num, int navNum);

	PageGoogle findRsdByBuildAndDegree(int num, int degree, int build,int navNum);

	int addRsd(Resident res);

}
