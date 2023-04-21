import java.time.Duration;
import java.time.Instant;

public class ExemploInstant {
	public static void main(String[] args) {
		
		Instant tempoInicial = Instant.now();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Instant tempoFinal = Instant.now();
		
		Duration duracao = Duration.between(tempoInicial, tempoFinal);
		
		System.out.println("Duração em Segundos: " + duracao.toNanos());
		System.out.println("Duração em Minutos: " + duracao.toMinutes());
		System.out.println("Duração em Horas: " + duracao.toHours());
		System.out.println("Duração em Milisegundos: " + duracao.toMillis());
		System.out.println("Duração em Dias: " + duracao.toDays());
		
		
		
	}

}
