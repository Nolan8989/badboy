package norlando.po;

import com.google.gson.annotations.Expose;

/*
 * CREATE TABLE `t_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `unitname` varchar(255) NOT NULL,
  `build_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;
 * 
 */
public class Unit {
	@Expose
	private int id;
	@Expose
	private String unitname;
	private int build_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public int getBuild_id() {
		return build_id;
	}
	public void setBuild_id(int buildId) {
		build_id = buildId;
	}
	public Unit() {
		super();
	}
	public Unit(int id, String unitname) {
		super();
		this.id = id;
		this.unitname = unitname;
	}
	
}
