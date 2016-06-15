package norlando.basedao;

import java.util.List;

public interface BaseDao<Entity> {
	
	public boolean save(Entity entity)throws Exception;
	
	public boolean update(Entity entity)throws Exception;
	
	public boolean delete(int id)throws Exception;
	
	public Entity findById(int id)throws Exception;
	
	public List<Entity> findAll()throws Exception;
	
}
