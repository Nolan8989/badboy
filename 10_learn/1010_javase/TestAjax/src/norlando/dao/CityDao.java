package norlando.dao;

import java.util.List;

import norlando.base.BaseDao;
import norlando.entity.City;

public interface CityDao extends BaseDao<City> {
	public List<City> cityByProId(int  proid)throws Exception;
		
	
}
