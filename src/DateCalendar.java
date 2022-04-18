import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

	public static void main(String[] args) {
		
		//somando e/ou subtraindo unidade de tempo
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//Obtendo uma unidade de tempo
		Calendar cald = Calendar.getInstance();
		cald.setTime(d);
		int minutes = cald.get(Calendar.MINUTE);
		int months = 1 + cald.get(Calendar.MONTH); //mês começa em zero, janeiro é igual a 0
		
		System.out.println(minutes);
		System.out.println(months);
		
	}

}
