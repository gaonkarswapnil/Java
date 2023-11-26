package cms;

public class CourseCollection {
	private static Course availableCourses[] = new Course[4];
	static {
		availableCourses[0] = new Course(101,"C++",80,"CDAC",10000);
		availableCourses[1] = new Course(102,"Python",85,"Udemy",5000);
		availableCourses[2] = new Course(103,"Java",100,"Coursera",15000);
		availableCourses[3] = new Course(104,"C#",38,"Udemy",5000);
	}
	
	public static void printCourseNames(String provider) throws ProviderNotFoundException{
//		for(int i=0; i<size; i++) {	
		boolean flag = false;
		for(Course courseType: availableCourses) {
			if(courseType.provider.equals(provider)) {
				flag = true;
				System.out.println(courseType.display());
			}
		}
		if(flag == false) {
			String error = "Entered Provider Name is not Available";
			ProviderNotFoundException pe = new ProviderNotFoundException(error, provider);
			throw pe;
		}
			
	}
}

