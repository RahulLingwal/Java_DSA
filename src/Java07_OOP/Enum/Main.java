package Java07_OOP.Enum;

public class Main {
    public static void main(String[] args) {
        Week day = Week.TUESDAY;
        System.out.println("\nDay =" + day);
        System.out.println("Ordinal = " + day.ordinal() + "\n");

        System.out.println("All days in weeks.");
        for (Week days : Week.values()) {
            System.out.println(days);
        }

        System.out.println("\n" + Week.valueOf("TUESDAY"));
    }

    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        // these are enum constants
        // public static final

        Week() {
            System.out.println("Constructor called for = " + this);

            //internally imagine like : public static final Week Monday = new Week();
        }
    }
}
