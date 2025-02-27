package Exercise.chapter11.q7;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {

            MyDate date = (MyDate) obj;
            return (this.day == date.day && this.month == date.month && this.year == date.year);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return day * 10 + month * 101 + year * 102;
    }
}

