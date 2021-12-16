import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Gigasecond {

    private final static long GIGA = 1_000_000_000;
    private final long secondsAfterGiga;

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        secondsAfterGiga = GIGA + moment.toEpochSecond(ZoneOffset.MIN);
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.ofEpochSecond(secondsAfterGiga, 0 , ZoneOffset.MIN);
    }
}
