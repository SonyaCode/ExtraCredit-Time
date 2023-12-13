public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        second++;
        helper();
    }

    public void add(Time other) {
        hour += other.hour;
        minute += other.minute;
        second += other.second;
        helper();
    }

    public String info() {
        String formattedHour = String.format("%02d", hour);
        String formattedMinute = String.format("%02d", minute);
        String formattedSecond = String.format("%02d", second);

        return formattedHour + ":" + formattedMinute + ":" + formattedSecond;
    }

    private void helper() {
        if (second >= 60) {
            int addToMin = second / 60;
            minute += addToMin;
            second = second % 60;
        }
        if (minute >= 60) {
            int addToHr = minute / 60;
            hour += addToHr;
            minute = minute % 60;
        }
        if (hour >= 24) {
            hour = hour % 24;
        }
    }
}
