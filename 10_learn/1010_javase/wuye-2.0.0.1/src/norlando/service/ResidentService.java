package norlando.service;

import java.util.List;

import norlando.po.Resident;
import norlando.util.PageGoogle;


public interface ResidentService {
	int getResidentCount();
	
	List findResidentAllPage(int startRow,int pageSize);
	
	PageGoogle findRsdByBuildAndDegree(int num,int degree,int buildid,int navNum);
	int addRsd(Resident rsd);
}
