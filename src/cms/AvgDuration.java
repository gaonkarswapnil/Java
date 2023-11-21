package cms;

public class AvgDuration extends CourseDataCalculator {
	float avgDuration;
	@Override
	public float doCalculation(Course[] courseList) {
		// TODO Auto-generated method stub
		for(Course courseType: courseList) {
			avgDuration += courseType.duration;
		}
		return (avgDuration/courseList.length);
	}

}
