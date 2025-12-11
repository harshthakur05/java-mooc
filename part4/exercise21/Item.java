package part4.exercise21;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private LocalDateTime createdAt;
    private String name;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return this.name + " (created at: " + this.createdAt.format(formatter) + ")";
    }
}

