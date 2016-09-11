public class DateCalculator {
    public static void main(String[] args) {
        int days = 361; //Any posetive number

        int years = (days - 1) / 360 + 1;
        int month = (days - 1 - ((years - 1) * 360)) / 30 + 1;
        int day = (days - ((years - 1) * 360) - ((month - 1) * 30));

        System.out.println("year = " + years);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
    }
}
