package norlando.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import norlando.dao.UserDao;
import norlando.dao.impl.UserDaoImpl;
import norlando.entity.User;
import norlando.services.UseSer;
import norlando.vo.UserVo;

public class UseSerImpl implements UseSer {

	
	
	
	UserDao ud = new UserDaoImpl();
	public List<UserVo> findUserVoByKeyWord(String username, int star, int step) {
		// TODO Auto-generated method stub
		List<User> userList = this.ud.findUserByKeyWord(username, star, step);
		List<UserVo> userVoList = new ArrayList<UserVo>();
		for (Iterator iterator = userList.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			UserVo userVo = new UserVo();
			userVo.setId(user.getId());
			userVo.setUsername(user.getUsername());
			userVo.setSex(user.getSex());
			userVo.setEmail(user.getEmail());
			userVo.setAddress(user.getAddress());
			userVo.setStartPage(star + 2);
			userVo.setStep(step);
			userVoList.add(userVo);
		}
		return userVoList;
	}

}
