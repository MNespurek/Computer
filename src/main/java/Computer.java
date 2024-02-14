import java.math.BigDecimal;

public class Computer {
    private String description;
    private int yearOfProduction;
    private BigDecimal price;

    private Computer(String description, int yearOfProduction, BigDecimal price) {
        this.description = description;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    private Computer(String description) {
        this(description, 1800, new BigDecimal(2000));
    }
}
