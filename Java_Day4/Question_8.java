import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Question_8 {


    public static void main(String[] args)   {


        Date objDate = new Date();
        String strDateFormat = "dd-MMMM-yyyy";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        System.out.println(objSDF.format(objDate));

    }

}
