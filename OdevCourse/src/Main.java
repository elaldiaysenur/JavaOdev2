import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Course course1= new Course(1,"Yazýlým Geliþtirme Kampý (C# Angular)","Ücretsiz","Engin Demiroð");
		
		
		Course course2= new Course(2,"Yazýlým Geliþtirme Kampý (Java+React)","Ücretsiz","Engin Demiroð");
		
		
		Course course3= new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs","Ücretsiz","Engin Demiroð");
		
		
		Course [] courses= {course1,course2,course3};
		
		
		for (Course course : courses) {
			
			System.out.println(course.name);
			
		}
		
		System.out.println(courses.length);
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Tümü";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Eðitmen";
		
		CourseManager courseManager=new CourseManager();
		courseManager.addToStudents(course1);
		courseManager.addToStudents(course2);
		courseManager.addToStudents(course3);

	}

}
