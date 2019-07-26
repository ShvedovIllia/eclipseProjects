package main;

public class Animal implements Comparable<Animal>{
	private String name;
	private Type type;
	private int age;

	
	
	public Animal(String name, Type type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", age=" + age + "]";
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public int compareTo(Animal o) {
		int res = name.compareTo(o.getName());
			if(res == 0) {
			res= age > o.getAge() ? 0 : 1;
		}
		if(res==0) {
			res= type.compareTo(o.getType());
		}
	
		return res;
	}
	
	
	
	

}
