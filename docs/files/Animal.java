
public abstract class Animal {
	protected String type;
	protected String species;
	protected String family;
	
	public Animal() {
	}
	
	public abstract String makesSound();
	
	public String toString() {
		String message = "";
		message += "The " + type;
		message += " of genus " + species;
		message += " and family " + family;
		message += " makes this sound: " + makesSound();
		return message;
	}

}
