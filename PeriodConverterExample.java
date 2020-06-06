package basics;

public class PeriodConverterExample {

	public static void main(String[] args) {
		//1234 days = 3 years, 4 months, 2 weeks and 5 days
		
		// # DATA - CONSTANTS    
	    final int YEAR_DAYS = 365;
	    final int MONTH_DAYS = 30;
	    final int WEEK_DAYS; 

	    // # DATA - variables
	    int periodDays = 1234;
	    int toYears;
	    int toMonth;
	    int toWeeks;

	    toMonth = (MONTH_DAYS % YEAR_DAYS) / 7;
	    toYears = periodDays / YEAR_DAYS; 
	    toWeeks = (MONTH_DAYS % YEAR_DAYS) % 7;
	    WEEK_DAYS = (periodDays % 365) % 7;
	    

	    // # PRINT RESULTS
	    System.out.println("1234 days = " + toYears + " years, " + toMonth + " months, " + toWeeks + " weeks, " + WEEK_DAYS + " days");

	    }

	}

