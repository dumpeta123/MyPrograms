package newProjcet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Person implements Comparable<Person> {
	String name;
	int age;
	String section;

	Person(String name, int age, String section) {
		this.name = name;
		this.age = age;
		this.section = section;

	}
	  @Override
	    public int compareTo(Person otherPerson) {
	        // Compare persons based on age
	        return Integer.compare(this.age, otherPerson.age);
	    }

//	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age='" + age + '\'' +  ", section='" + section + "'" +'}';
	}

	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();

		people.add(new Person("Rome", 21, "sec"));
		people.add(new Person("Tom", 27, "sec"));
		people.add(new Person("Ram", 25, "first"));

		 // Sorting using Collections.sort()
        Collections.sort(people);

		System.out.println("Sorted people by age:");
		for (Person person : people) {
			System.out.println(person);

		}
	}

}
