package ShopApp;

import java.util.Calendar;

public enum Special {
    ;
    public void CheckSaleDay() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                System.out.println("Sunny Sunday: Hats are 50%");
                break;
            case Calendar.MONDAY:
                System.out.println("Monday: 10% off your purchase");
                break;
            case Calendar.TUESDAY:
                System.out.println("Tuesday: Buy 'Tue' get Two Sweaters");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Wednesday: Half off one item!");
                break;
            case Calendar.THURSDAY:
                System.out.println("Thursday: Take 20% off Apparel");
                break;
            case Calendar.FRIDAY:
                System.out.println("'Fry'Day BOGO Fries!");
                break;
            case Calendar.SATURDAY:
                System.out.println("Shirts are buy 2 get 1 Free");
                break;
            default:
                System.out.println("Invalid day of the week!");
        }

    }
}
