package com.bjsxt.dao;

import java.util.List;

public interface AnalysisDataDao {
	List analysisDegreeByBuildId(int buildId);
	List analysisAgePartByBuildId(int buildId);
}
