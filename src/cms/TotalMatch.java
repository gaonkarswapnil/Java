package cms;

public class TotalMatch implements CourseInfoProcessor {
	private int totalCount;
	@Override
	public float processCourseInfo(Course[] courseList, CourseInfo courseInfo) {
		
		
		// TODO Auto-generated method stub
		for(Course courseType: courseList) {
			CourseInfo ci = new CourseInfo(courseType.provider, courseType.duration);
			if(ci.equals(courseInfo)) {
				totalCount += 1;
			}
		}
		return totalCount;
	}
	
	
	
}