package norlando.servies.impl;

import java.util.List;

import norlando.dao.FindAddrDao;
import norlando.dao.impl.FindAddrDaoImpl;
import norlando.services.FindAddrService;

public class FindAddrServiceImpl implements FindAddrService {
	private static FindAddrDao findAddrDao = new FindAddrDaoImpl();
	@Override
	public List findAllBuilding() {
		// TODO Auto-generated method stub
		return findAddrDao.findAllBuilding();
	}

}
