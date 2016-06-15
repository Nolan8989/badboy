package norlando.services;

import java.util.List;

import norlando.vo.UserVo;

public interface UseSer {

	List<UserVo> findUserVoByKeyWord(String username, int star, int step);
	
}
