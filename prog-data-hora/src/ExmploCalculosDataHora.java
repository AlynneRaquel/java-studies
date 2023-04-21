import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExmploCalculosDataHora {

	public static void main(String[] args) {
		
		LocalDate dataFormatada = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraFormatada = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraFormatadaGMT = Instant.parse("2022-07-20T01:30:26z");
		
		LocalDate pastWeekLocalDate = dataFormatada.minusDays(7);
		LocalDate nextWeekLocalDate = dataFormatada.plusDays(7);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);

	}

}
