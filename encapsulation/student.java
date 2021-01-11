package encapsulation;

public class student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 20) {
			System.out.println("you are to old to add in narshari school  !!");
		}else {
		this.age = age;}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<= 2) {System.out.println("name is in valide!!");}else {
			this.name = name;
		}
	}
}
