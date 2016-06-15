package norlando.service;

import java.util.List;

public interface AnalysisDataService {
	String analysisDegreeByBuildId(int buildId);
	String analysisAgePartByBuildId(int buildId);
	List findAnalysisDegreeByBuildId(int buildId);
}
