package co.grandcircus.DonutApi.entity;

public class Details {

	private Long id;
	private String ref;
	private String name;
	private Long calories;
	private String[] extras;
	private String photo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCalories() {
		return calories;
	}
	public void setCalories(Long calories) {
		this.calories = calories;
	}
	public String[] getExtras() {
		return extras;
	}
	public void setExtras(String[] extras) {
		this.extras = extras;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
}
