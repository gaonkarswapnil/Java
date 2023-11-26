package cms;

public class CourseAvgFees implements CourseInfoProcessor {
	private float avgFees;
	private int total;
	@Override
	public float processCourseInfo(Course[] courseList, CourseInfo courseInfo) {
		// TODO Auto-generated method stub
		for(Course courseType: courseList) {
			CourseInfo ci = new CourseInfo(courseType.provider, courseType.duration);
			if(ci.equals(courseInfo)) {
				avgFees += courseType.fees;
				total += 1;
			}
		}
		return (avgFees/total);
	}

}
