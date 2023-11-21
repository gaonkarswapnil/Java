package cms;

public class CourseProcessor {
	public static void printShortDurationCourseNames(Course[] courseList) {
		for(Course courseType: courseList) {
			int courseDuration = courseType.duration;
			if(courseDuration < 40) {
				System.out.println("Title: "+courseType.title);
			}
		}
	}
}
