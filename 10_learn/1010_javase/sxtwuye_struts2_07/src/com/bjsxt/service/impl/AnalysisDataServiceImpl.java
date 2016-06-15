package com.bjsxt.service.impl;

import java.util.List;

import com.bjsxt.dao.AnalysisDataDao;
import com.bjsxt.dao.impl.AnalysisDataDaoImpl;
import com.bjsxt.service.AnalysisDataService;
import com.bjsxt.util.ChartsXml;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class AnalysisDataServiceImpl implements AnalysisDataService{
	private static AnalysisDataDao analysisDataDao =  new AnalysisDataDaoImpl();
	@Override
	public String analysisDegreeByBuildId(int buildId) {
		// TODO Auto-generated method stub
		List dataSetList = analysisDataDao.analysisDegreeByBuildId(buildId);
		
		String xml = ChartsXml.buildPieXml(dataSetList, "楼栋学历分析	", "www.bjsxt.com", true);
		
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
		String xml = ChartsXml.buildXml(dataSetList, "年龄段分析", "", "年龄段", "人数", true);
		
		return xml;
	}

}
