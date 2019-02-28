import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Question_9 {

    public static void main(String[] args) {

        Locale locale = new Locale("da", "DK");
        Locale locale2 = new Locale("en", "UK");
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.DEFAULT,DateFormat.DEFAULT, locale2);
    //    SimpleDateFormat sdf = new SimpleDateFormat("DD-MMMM-YYYY");

        String date = dateFormat.format(new Date());
        System.out.println("In UK Locale : "+date);
        dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.DEFAULT,DateFormat.DEFAULT, locale);

        date = dateFormat.format(new Date());
        System.out.println("In DK Locale : " + date);

    }

}
