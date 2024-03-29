
public class EmpWageBuilderWhile {

	
    // constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final	int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;
	
	  
         public static void main(String[] args) {
			
		  // variable              
		  int totalEmpWage = 2;
		  int totalEmpHrs = 0;
		  int totalWorkingDays = 0;							
		  // Computation
		 while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
				 totalWorkingDays < NUM_OF_WORKING_DAYS) {
		         int empHrs = 0;
			     totalWorkingDays++;
		         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			 switch ( empCheck ) {
		      case    IS_FULL_TIME:
			          empHrs = 8;
		      case  IS_PART_TIME:
		    	      empHrs = 4;
		      break;
		      default: 
		    	totalEmpHrs += empHrs;  
                empHrs = 0;}
				int empWage = empHrs * EMP_RATE_PER_HOUR;
				totalEmpWage += empWage;
				System.out.println("Emp Wage:" + empWage);
		        System.out.println("Total Emp wage:" + totalEmpWage);

				
		 }
    }
}

	


