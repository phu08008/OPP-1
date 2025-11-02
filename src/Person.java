
public class Person {
//	firstName: String
//	- lastName : String
//	- age: int
//	- job: String
	String firstName;
	String lastName;
	int age;
	String job;
	String address;
	
void setJob(String currentjob) {
	job=currentjob;
	
}


void setAddress(String currentaddress) {
	address=currentaddress;
}
	
	@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", job=" + job + ", address="
			+ address + "]";
}

	
	
	

	public Person(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person huy = new Person("Phu","Nguyen",30);
huy.setAddress("Ho Chi Minh");
huy.setJob("IT");
System.out.println(huy);

System.out.println(huy);

	}

}
