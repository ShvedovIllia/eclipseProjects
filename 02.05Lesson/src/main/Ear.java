package main;

public class Ear {
	private String form;

	public Ear(String form) {
		this.form = form;
	}
	
	public void hear() {
		System.out.println("I`m hear you! ahahaha");
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	@Override
	public String toString() {
		return "Ear [form=" + form + "]";
	}
	
	
	
	

}
