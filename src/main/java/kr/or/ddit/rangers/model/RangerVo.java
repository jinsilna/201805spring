package kr.or.ddit.rangers.model;

public class RangerVo {
	private String rangersId;
	private String name;
	public String getRangersId() {
		return rangersId;
	}
	public void setRangersId(String rangersId) {
		this.rangersId = rangersId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RangersVo [rangersId=" + rangersId + ", name=" + name + "]";
	}
	public RangerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
