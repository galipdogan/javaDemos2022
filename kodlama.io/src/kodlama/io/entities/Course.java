package kodlama.io.entities;

public class Course {
	private String name;
	private String detail;
	private double unitPrice;

	public Course() {
		super();
	}

	public Course(String name, String detail, double unitPrice) {
		super();
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
