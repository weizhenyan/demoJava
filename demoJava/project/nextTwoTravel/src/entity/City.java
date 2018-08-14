package entity;

public class City {

	private int city_id;
	private String city_name;
	private int city_pro_id;
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public int getCity_pro_id() {
		return city_pro_id;
	}
	public void setCity_pro_id(int city_pro_id) {
		this.city_pro_id = city_pro_id;
	}
	public City(int city_id, String city_name, int city_pro_id) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
		this.city_pro_id = city_pro_id;
	}
	
	public City() {
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", city_name=" + city_name + ", city_pro_id=" + city_pro_id + "]";
	}
	
}
