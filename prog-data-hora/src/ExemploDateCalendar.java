import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ExemploDateCalendar {

	public static void main(String[] args) throws ParseException {

		// formatando datas
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

		// Mudando Time Zone
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		// data atual
		Date dataAtual = new Date();
		Date dataAtual1 = new Date(System.currentTimeMillis());
		Date dataAtual2 = new Date(0L);
		Date dataAtual3 = new Date(1000L * 60L * 60L + 5L);

		// ISO 8601
		Date iso = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		// parse
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");

		System.out.println("--------------------------------------");
		System.out.println(dataAtual);
		System.out.println(dataAtual1);
		System.out.println(dataAtual2);
		System.out.println(dataAtual3);
		System.out.println(iso);
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("--------------------------------------");
		System.out.println(sdf2.format(dataAtual));
		System.out.println(sdf2.format(dataAtual1));
		System.out.println(sdf2.format(dataAtual2));
		System.out.println(sdf2.format(dataAtual3));
		System.out.println(sdf2.format(iso));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println("--------------------------------------");
		System.out.println(sdf3.format(dataAtual));
		System.out.println(sdf3.format(dataAtual1));
		System.out.println(sdf3.format(dataAtual2));
		System.out.println(sdf3.format(dataAtual3));
		System.out.println(sdf3.format(iso));
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
	}

}
