package odev;

public class Courses {
	public Courses() {
		
	}
	public Courses(String name, int id, String teacher, int percent){
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.percent = percent;
	}
	String name;
	int id;
	String teacher;
	int percent;
}
