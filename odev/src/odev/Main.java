package odev;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses("Java ve React Kampı",1, "Engin Demiroğ", 36);
		Courses[] courses = {
				course1
		};
		
		for (Courses course : courses) {
			System.out.println("Kursun ismi: " + course.name);
			System.out.println("Eğitmen: " + course.teacher);
			System.out.println("%" + course.percent + "tamamlandı");
			
		}
		CourseManager courseManager = new CourseManager();
		courseManager.checkLessons(course1);
		
		
	}

}
