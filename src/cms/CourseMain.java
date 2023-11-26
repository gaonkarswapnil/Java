package cms;

public class CourseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		===========================TODO1==================================
		System.out.println("===========================TODO1==================================");
		Course c1 = new Course(101,"C++",80,"CDAC",10000);
		Course c2 = new Course(102,"Python",85,"Udemy",5000);
		Course c3 = new Course(103,"Java",100,"Coursera",15000);
		Course c4 = new Course(104,"C#",38,"Sunbeam",5000);
		Course c5 = new Course(105,"SQL",30,"UpGrad",5000);
		
		System.out.println(c1.display()+"\n");
		System.out.println(c2.display()+"\n");
		System.out.println(c3.display()+"\n");
		System.out.println(c4.display()+"\n");
		System.out.println(c5.display()+"\n");
		
		
//		===========================TODO2==================================
		System.out.println("===========================TODO2==================================");
		System.out.println("Total Course: "+Course.courseCount);
		
		
//		===========================TODO3==================================
		System.out.println("===========================TODO3==================================");
		Course courseList[] = new Course[5]; 
		courseList[0] = new Course(101,"C++",80,"CDAC",10000);
		courseList[1] = new Course(102,"Python",85,"Udemy",5000);
		courseList[2] = new Course(103,"Java",100,"Coursera",15000);
		courseList[3] = new Course(104,"C#",38,"Sunbeam",5000);
		courseList[4] = new Course(105,"SQL",85,"Udemy",5000);
		
		CourseProcessor cp = new CourseProcessor();
		
		System.out.println("\nNames of course less than 40 Duration is: ");
		cp.printShortDurationCourseNames(courseList);
		
		
//		===========================TODO4==================================
		System.out.println("===========================TODO4==================================");
		CourseDataCalculator cdc = new AvgDuration();
		System.out.println("Average duration is: "+cdc.doCalculation(courseList));
		
		
		cdc = new AvgFees();
		System.out.println("Average Fees is: "+cdc.doCalculation(courseList));
		
		
		
//		===========================TODO5==================================
		System.out.println("===========================TODO5==================================");
		CourseInfo courseInfo = new CourseInfo("Udemy", 85); 
		CourseInfoProcessor cip;
		cip = new TotalMatch();
		System.out.println("Total matching courses  are "+cip.processCourseInfo(courseList, courseInfo));
		
		cip = new CourseAvgFees();
		System.out.println("Average fees matching course are "+cip.processCourseInfo(courseList, courseInfo));
		

//		===========================TODO6==================================
		System.out.println("===========================TODO6==================================");
		CourseCollection cc = new CourseCollection();
		try {
			cc.printCourseNames("Sunbeam");
		} catch (ProviderNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}

}
