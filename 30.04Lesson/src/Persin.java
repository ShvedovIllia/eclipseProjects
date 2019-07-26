
public class Persin {
	private String name;

	
	public Persin() {
		super();
	}


	public Persin(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void work(String name) {
		System.out.println( name + "is working");
	}
	
	
}
