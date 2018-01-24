package of3;

public class Student {
	private int studentId;
	private int age;
	private char gender;
	private String name;
	private static int nextStudentId = 0; // Denne er static så vi kan øke den for hver nye student, og dermed få en unik ID på hver enkelt
	
	// Her kunne man hatt flere felt, f.eks. en liste med fag (ArrayList<String>), karakterer, e.l.
	
	public Student(String name) {
		this.name = name;
		studentId = Student.nextStudentId;
		Student.nextStudentId++;
	}
	
	public void setGender(char gender) {
		if (gender == 'm' || gender == 'f') {
			this.gender = gender;
		}
		else {
			throw new IllegalArgumentException("Gender must be either 'f' or 'm'");
		}
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age must be more than 0");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public static void main(String... args) {
		Student s1 = new Student("Ola");
		Student s2 = new Student("Kari");
		
		s1.setGender('m');
		s2.setGender('v');
		
		System.out.println(s1.name + ", " + s1.studentId);
		System.out.println(s2.name + ", " + s2.studentId);
	}
}
