package ch_03_02;

public class StringPlus {

    StringBuilder sb = null;

    StringPlus() {
        sb = new StringBuilder(32);
    }

    public void append(String str) {
        sb.append(str);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    public StringPlus appendLine(String str) {
        this.append(str);
        this.line();
        return this;
    }

    public StringPlus appendFormat(String format, Object... args) {
        sb.append(String.format(format, args));
        return this;
    }

    public StringPlus line() {
        sb.append(System.lineSeparator());
        return this;
    }
}
