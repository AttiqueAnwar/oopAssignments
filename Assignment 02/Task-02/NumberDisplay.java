public class NumberDisplay {
    private int limit;
    private int value;
    private String ampm;

    public NumberDisplay(int rollOverLimit) {
        this.limit = rollOverLimit;
        this.value = 0;
    }

    public NumberDisplay() {

        this.ampm = "am";
    }

    public void increment() {
        this.value = (value + 1) % limit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int replacementValue) {
        if ((replacementValue >= 0) && (replacementValue < limit)) {
            this.value = replacementValue;
        }
    }

    public void setValue(String replacementValue) {
        if (replacementValue.equals("AM") || replacementValue.equals("am") || replacementValue.equals("PM")
                || replacementValue.equals("pm")) {
            this.ampm = replacementValue;
        }
    }

    public String setampm(String aa) {
        return this.ampm = aa;
    }

    public void setampm() {

        if ((ampm.equals("am")) || (ampm.equals("AM")))
            ampm = "PM";

        if (ampm.equals("PM") || ampm.equals("pm"))
            ampm = "AM";
    }

    public String getam() {
        return ampm;
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
}