package norlando.po;

import com.google.gson.annotations.Expose;

/*
 * CREATE TABLE `t_room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomtype` int(11) DEFAULT NULL,
  `roomname` varchar(255) DEFAULT NULL,
  `roomnum` varchar(255) DEFAULT NULL,
  `unit_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gbk;
 */
public class Room {
	@Expose
	private int id;
	private int roomtype;
	@Expose
	private String roomname;
	private String roomnum;
	private int unit_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(int roomtype) {
		this.roomtype = roomtype;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unitId) {
		unit_id = unitId;
	}
	public Room(int id, String roomname) {
		super();
		this.id = id;
		this.roomname = roomname;
	}
	public Room() {
		super();
	}
	
	
}
