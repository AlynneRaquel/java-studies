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
		
		System.out.println("Dura��o em Segundos: " + duracao.toNanos());
		System.out.println("Dura��o em Minutos: " + duracao.toMinutes());
		System.out.println("Dura��o em Horas: " + duracao.toHours());
		System.out.println("Dura��o em Milisegundos: " + duracao.toMillis());
		System.out.println("Dura��o em Dias: " + duracao.toDays());
		
		
		
	}

}
