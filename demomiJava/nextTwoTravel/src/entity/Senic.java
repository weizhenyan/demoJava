package entity;

public class Senic {

	private int sen_id;
	private String sen_name;
	private String sen_desc;
	private String sen_city;
	public int getSen_id() {
		return sen_id;
	}
	public void setSen_id(int sen_id) {
		this.sen_id = sen_id;
	}
	public String getSen_name() {
		return sen_name;
	}
	public void setSen_name(String sen_name) {
		this.sen_name = sen_name;
	}
	public String getSen_desc() {
		return sen_desc;
	}
	public void setSen_desc(String sen_desc) {
		this.sen_desc = sen_desc;
	}
	public String getSen_city() {
		return sen_city;
	}
	public void setSen_city(String sen_city) {
		this.sen_city = sen_city;
	}
	public Senic(int sen_id, String sen_name, String sen_desc, String sen_city) {
		super();
		this.sen_id = sen_id;
		this.sen_name = sen_name;
		this.sen_desc = sen_desc;
		this.sen_city = sen_city;
	}
	
	public Senic() {
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Senic [sen_id=" + sen_id + ", sen_name=" + sen_name + ", sen_desc=" + sen_desc + ", sen_city="
				+ sen_city + "]";
	}
	
	
}
