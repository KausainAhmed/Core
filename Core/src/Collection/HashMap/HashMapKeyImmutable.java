package Collection.HashMap;

import java.util.Objects;

//why hashmap key is immutable
 class Student1 {
  private String name;

public String getName() {
	return name;  }
	
	public Student1(String name) {
		super();
		this.name=name;
	}
	public void setName(String name) {
this.name=name; }
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(name, other.name);
	}
}

