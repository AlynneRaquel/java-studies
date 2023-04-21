import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		
		LocalDateTime horarioAtual = LocalDateTime.now();
		Instant horarioAtualGMT = Instant.now();
		
		LocalDate dataFormatada = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraFormatada = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraFormatadaGMT = Instant.parse("2022-07-20T01:30:26z");
		Instant dataHoraFormatadaGMTSP = Instant.parse("2022-07-20T01:30:26-03:00"); //horário de SP
		LocalDate dataOf = LocalDate.of(2022, 7, 20);
		
		System.out.println("Data Atual = " + data);
		System.out.println("Horário Atual = " + horarioAtual);
		System.out.println("Horário Atual GMT = " + horarioAtualGMT);
		System.out.println("Data Formatada = " + dataFormatada);
		System.out.println("Data/Hora Formatada = " + dataHoraFormatada);
		System.out.println("Data/Hora Formatada GMT = " + dataHoraFormatadaGMT);
		System.out.println("Data/Hora Formatada GMT SP = " + dataHoraFormatadaGMTSP);
		System.out.println("Data/Hora Formatada OF = " + dataOf);
		
		System.out.println("Dia da Semana = " + data.getDayOfWeek().name());
		System.out.println("Dia da Semana = " + data.getDayOfWeek().ordinal());
		System.out.println("Mes = " + data.getMonthValue());
		System.out.println("Mes = " + data.getMonth().name());
		System.out.println("Mes = " + data.getYear());
		System.out.println("Mes = " + data.getDayOfYear());
		
		//converter LocalDate para LocalDateTime(.atTime(0,0) ou atStartOfDay);
		//Duration t1 = Duration.beteween(data1.atTime(0,0), data2.atTime(0,0));
		
	
		
		
	}

}
