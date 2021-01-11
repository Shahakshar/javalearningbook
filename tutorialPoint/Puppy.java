package tutorialPoint;

public class Puppy {
	
	int puppyAge;
	
	public Puppy(String name) {
		System.out.println("passed name is:" + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("Puppy's age is:" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		
		Puppy MyPuppy = new Puppy( "tommy" );
		MyPuppy.setAge(2);
		MyPuppy.getAge();
		System.out.println("variable value is: " + MyPuppy.puppyAge);
	}

}