package main;

public class Helm {
	private String form;
	
	public Helm(String form) {
		this.form = form;
	}

	public void turn() {
		System.out.println("I`m turn to left or to right");
		System.out.println("i have " + form + "form!");
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	@Override
	public String toString() {
		return "Helm [form=" + form + "]";
	}
	
	
}
