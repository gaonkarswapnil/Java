package cms;

public class AvgFees extends CourseDataCalculator {
	float avgFees;
	@Override
	public float doCalculation(Course[] courseList) {
		// TODO Auto-generated method stub
		for(Course courseType: courseList) {
			avgFees += courseType.fees;
		}
		return (avgFees/courseList.length);
	}

}
