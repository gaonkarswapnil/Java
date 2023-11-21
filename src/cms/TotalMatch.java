package cms;

public class TotalMatch implements CourseInfoProcessor {
	private int totalCount;
	@Override
	public float processCourseInfo(Course[] courseList, CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		for(Course courseType: courseList) {
			if((courseType.provider.equals(courseInfo.getProviderName())) && (courseType.duration==courseInfo.getDuration())) {
				totalCount += 1;
			}
		}
		return totalCount;
	}
	
	
	
}