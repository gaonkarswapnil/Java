package cms;

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
		
}
