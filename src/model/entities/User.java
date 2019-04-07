package model.entities;

public class User implements Comparable <User>{
	private Integer idNumber;
	
	public User(Integer idNumber) {
		this.idNumber = idNumber;
	}

	public Integer getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Integer idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idNumber == null) ? 0 : idNumber.hashCode());
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
		User other = (User) obj;
		if (idNumber == null) {
			if (other.idNumber != null)
				return false;
		} else if (!idNumber.equals(other.idNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "idNumber = " + idNumber;
	}

	@Override
	public int compareTo(User other) {
		return idNumber.compareTo(other.idNumber);
	}	

	
	
}
