package keerthi;

public class Person {
	
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	  
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	}
	 class Main {
	    public static void main(String[] args) {
	        Person person1 = new Person("keerthi", 30);
	        Person person2 = new Person("sukil", 25);

	        System.out.println("Person 1:");
	        System.out.println("Name: " + person1.getName());
	        System.out.println("Age: " + person1.getAge());

	        System.out.println("\nPerson 2:");
	        System.out.println("Name: " + person2.getName());
	        System.out.println("Age: " + person2.getAge());
	    }
	}

