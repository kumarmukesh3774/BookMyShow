package model;
import java.time.LocalDateTime;
import java.util.List;

public record Show(Movie movie, LocalDateTime dateTime, List<Seat> seats ) {
}
