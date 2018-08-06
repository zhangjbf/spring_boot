package com.javaboy;

import java.io.Serializable;
import java.util.HashSet;

public class TestPerson {

	public static void main(String[] args) {

		Person ps = new Person("javaboy", "1");

		Person pss = new Person("javaboy", "1");

		System.out.println(ps.equals(pss));

		HashSet<Person> set = new HashSet<>();
		set.add(ps);
		set.add(pss);

		System.out.println(set);
	}

}

class Person implements Serializable {

	private String name;

	private String id;

	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

interface Itf {
	void say();
}

abstract class AbsItf implements Itf {

}

class TestItf {

	public static void main(String[] args) {
		new AbsItf() {

			@Override
			public void say() {
				System.out.println("javaboy");
			}

		}.say();
		;
	}
}

class A {

	static {
		System.out.print("1");
	}

	public A() {
		System.out.print("2");
	}
}

class B extends A {

	static {
		System.out.print("a");
	}

	public B() {
		System.out.print("b");
	}
}

class Hello1324 {

	public static void main(String[] args) {
		A ab = new B();
		ab = new B();
	}

}

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}
 
class Human {
 
    public static void main(String[] args) 
        throws Exception {
        try {
            try {
                throw new Annoyance();
            } 
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        } 
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }
}