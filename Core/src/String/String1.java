package String;


//immutable class
final class String1 {
	private final int id;
	private final String name;

	public String1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return 420;
	}

	@Override
	public boolean equals(Object obj) {
		String1 s=(String1) obj;
		if(s.getId()==id && s.getName()==name){
		return true;
	} else {
		return false;}
	}
}