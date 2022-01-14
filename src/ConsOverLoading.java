class Student{
	void college() {
		System.out.println("College Name is ABCDE");
	}
	void college(int Id) {
		System.out.println("College Id is  "+ Id);
	}
	void college(int pincode, String name) {
		System.out.println("College pincode is "+ pincode + " and Colleg name is "+ name);
		
	}
}


public class ConsOverLoading {
	public static void main(String[] args) {
		Student s=new Student();
		s.college();
		s.college(1011);
		s.college(2340,"QWERT");
	}

}
