package norlando.entity;

public class Gro {
	private int gid;
	private String gname;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Gro(int gid, String gname) {
		super();
		this.gid = gid;
		this.gname = gname;
	}
	public Gro() {
		super();
		// TODO Auto-generated constructor stub
	}
}
