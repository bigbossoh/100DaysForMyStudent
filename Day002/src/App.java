
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class App {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter FORMATTER_DATE = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) throws Exception {
        LocalDateTime dateTime=LocalDateTime.now();
        LocalDate date= LocalDate.now();
        String DateTimeFormatted= dateTime.format(FORMATTER);
        String DateFormatted= date.format(FORMATTER_DATE);
        System.out.println("Date et heure format: "+DateTimeFormatted );
        System.out.println("Date  formaté: "+DateFormatted );
    }
}
