package model.entities;

import java.util.Date;

public class LogEntry {
	
	private String name;
	private Date time;
	
	public LogEntry(String name, Date time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public Date getTime() {
		return time;
	}

	@Override
	
	public String toString() {
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		LogEntry other = (LogEntry) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
	

}
