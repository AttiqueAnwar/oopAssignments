public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay sec;
    private NumberDisplay amPm;
    private String displayString;

    public ClockDisplay() {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        sec = new NumberDisplay(60);
        amPm = new NumberDisplay();
    }

    public void timeTick() {
        sec.increment();
        if (sec.getValue() == 0) {
            minutes.increment();
            if (minutes.getValue() == 0) {
                hours.increment();

                if (hours.getValue() == 00) {

                    amPm.setampm();
                }
            }
        }

        updateDisplay();
    }

    public void setTime(int hour, int minute, int secs, String am) {
        hours.setValue(hour);
        minutes.setValue(minute);
        sec.setValue(secs);
        amPm.setValue(am);
        updateDisplay();
    }

    public String getTime() {
        return displayString;
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + sec.getDisplayValue() + " "
                + amPm.getam();
    }
}