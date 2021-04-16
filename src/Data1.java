public class Data1 {
    private int year;
    private int month;
    private int day;


    public Data1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Data1(int year, int month) {
        this.year = year;
        this.month = month;
        this.day = -55;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int compareTo(Data1 data1) {
        if (this.getDay() == -55) {
            if ((this.getYear() >= data1.getYear()) && (this.getMonth() > data1.getMonth())) {
                return 1;
            } else if (this.equals(data1.getYear()) && this.equals(data1.getMonth())) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if ((this.getYear() >= data1.getYear()) &&
                    (this.getMonth() >= data1.getMonth()) && (this.getDay() > data1.getDay())) {
                return 1;
            } else if (this.equals(data1.getYear()) && this.equals(data1.getMonth()) && this.equals(data1.getDay())) {
                return 0;
            } else {
                return -1;
            }

        }
    }
}