package norlando.servies.impl;

import java.util.List;

import norlando.dao.AnalysisDataDao;
import norlando.dao.impl.AnalysisDataDaoImpl;
import norlando.services.AnalysisDataService;
import norlando.util.ChartsXml;

public class AnalysisDataServiceImpl implements AnalysisDataService {

	private static AnalysisDataDao analysisDataDao =  new AnalysisDataDaoImpl();
	@Override
	public String analysisDegreeByBuildId(int buildId) {
		// TODO Auto-generated method stub
		List dataSetList = analysisDataDao.analysisDegreeByBuildId(buildId);
		
		String xml = ChartsXml.buildPieXml(dataSetList, "楼栋学历分析	", "www.bjsxt.com", false);
		
		return xml;
	}
	
	
	@Override
	public List analysisDegreeByBuildIdJsp(int buildId) {
		// TODO Auto-generated method stub
		List dataSetList = analysisDataDao.analysisDegreeByBuildId(buildId);
		return dataSetList;
	}

}
