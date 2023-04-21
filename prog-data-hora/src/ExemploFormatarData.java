import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ExemploFormatarData {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		DateTimeFormatter formatadorComBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorComTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("Data com Barra  = " + hoje.format(formatadorComBarra));
		System.out.println("Data com Traço  = " + hoje.format(formatadorComTraco));
		System.out.println("Data com Traço  = " + formatadorComTraco.format(hoje));
		
		Instant dataHoraZona = Instant.parse("2022-07-20T01:30:26Z");
		DateTimeFormatter formatadorZona = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("Data com Zone  = " + formatadorZona.format(dataHoraZona));
		
		LocalDateTime dataHoraISO = LocalDateTime.parse("2022-07-20T01:30:26");
		DateTimeFormatter formatadorComISO = DateTimeFormatter.ISO_DATE_TIME;
		//DateTimeFormatter formatadorComISO = DateTimeFormatter.ISO_INSTANT; quando for Instant
		
		System.out.println("Data com ISO  = " + formatadorComISO.format(dataHoraISO));

	
	}
}
