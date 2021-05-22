
public class Course {
	
	public Course() {
		System.out.println("Programý Baþlat");
	}
	
	public Course (int id, String name, String coursePrice, String detail) {
		this();
		this.id=id;
		this.name=name;
		this.coursePrice=coursePrice;
		this.detail=detail;
	}
	
	int id;
	String name;
	String coursePrice;
	String detail;

}
