package norlando.dao;

import java.util.List;


public interface AnalysisDataDao extends BaseDao{

	List analysisDegreeByBuildId(int buildId);

}
