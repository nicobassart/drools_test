package test;



import java.text.SimpleDateFormat;
import java.util.Date;





public class test {

	public static void main(String[] args) {

		    try {
		        //Dates to compare
		        String CurrentDate=  "09/01/2015";
		        String FinalDate=  "09/26/2015";

		        java.util.Date date1;
		        Date date2;

		        SimpleDateFormat dates = new SimpleDateFormat("MM/dd/yyyy");

		        //Setting dates
		        date1 = dates.parse(CurrentDate);
		        date2 = dates.parse(FinalDate);

		        //Comparing dates
		        long difference = Math.abs(date1.getTime() - date2.getTime());
		        long differenceDates = difference / (24 * 60 * 60 * 1000);

		        //Convert long to String
		        String dayDifference = Long.toString(differenceDates);

		        System.out.print(dayDifference);
		    }
		    catch (Exception exception) {
		    	System.out.print(exception);
		    }
		}

}
