package cms;

import java.util.Objects;

public class CourseInfo {
	
	private String providerName;
	private int duration;
	
	public CourseInfo(String providerName, int duration) {
		this.providerName = providerName;
		this.duration = duration;
	}

	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(duration, providerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseInfo other = (CourseInfo) obj;
		return duration == other.duration && Objects.equals(providerName, other.providerName);
	}
}
