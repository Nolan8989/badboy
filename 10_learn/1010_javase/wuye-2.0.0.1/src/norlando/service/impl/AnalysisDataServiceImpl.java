package norlando.service.impl;

import java.util.List;

import norlando.dao.AnalysisDataDao;
import norlando.dao.impl.AnalysisDataDaoImpl;
import norlando.service.AnalysisDataService;
import norlando.util.ChartsXml;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class AnalysisDataServiceImpl implements AnalysisDataService{
	private static AnalysisDataDao analysisDataDao =  new AnalysisDataDaoImpl();
	@Override
	public String analysisDegreeByBuildId(int buildId) {
		// TODO Auto-generated method stub
		List dataSetList = analysisDataDao.analysisDegreeByBuildId(buildId);
		
		String xml = ChartsXml.buildPieXml(dataSetList, "妤兼爧瀛﹀巻鍒嗘瀽	", "www.bjsxt.com", true);
		
		return xml;
	}
	@Override
	public List findAnalysisDegreeByBuildId(int buildId) {
		// TODO Auto-generated method stub
		List dataSetList = analysisDataDao.analysisDegreeByBuildId(buildId);
		return dataSetList;
	}
	@Override
	public String analysisAgePartByBuildId(int buildId) {
		// TODO Auto-generated method stub
		List dataSetList = analysisDataDao.analysisAgePartByBuildId(buildId);
		String xml = ChartsXml.buildXml(dataSetList, "骞撮緞娈靛垎鏋", "", "骞撮緞娈", "浜烘暟", true);
		
		return xml;
	}

}
