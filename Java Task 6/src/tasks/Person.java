package tasks;

public class Person {
	
	//Attributes
	String name;
	int age;	
	
	//Constructor
	public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }
	
	//Getter
	
	public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    
    //Main
	public static void main(String[] args) {	
		
		Person p = new Person("Robert Niro", 60);
        System.out.println("Name: " + p.getName());
        System.out.println("Age : " + p.getAge());

	}

}
