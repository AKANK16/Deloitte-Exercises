
public class Employee {
	private int eid;
	private String name;
	private String mobile;
	private String address;
	private String dept;
	public int getEid() {
		return eid;
	}
	public void setSid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setStream(String dept) {
		this.dept = dept;
	}
	public Employee(int eid, String name, String mobile, String address,
			String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", name=" + name + ", mobile=" + mobile
				+ ", address=" + address + ", dept=" + dept + "]";
	}
	

}
