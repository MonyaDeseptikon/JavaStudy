import java.time.LocalDate;

public enum Holiday {
    NY(LocalDate.of(1900, 01, 01)), March (LocalDate.of(1900, 03, 8)),  February(LocalDate.of(1900, 02, 23));
    private final LocalDate localDate;

    Holiday(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getHoliday() {
        return localDate;
    }
}
