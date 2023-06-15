import java.util.Objects;

class Tape {
    private int length;
    private int width;

    public Tape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Length: " + length + " inches, Width: " + width + " inches";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tape tape = (Tape) obj;
        return length == tape.length && width == tape.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}

