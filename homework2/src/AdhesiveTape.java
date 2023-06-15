import java.util.Objects;

public class AdhesiveTape extends Tape {
    private int stickinessFactor;

    public AdhesiveTape(int length, int width, int stickinessFactor) {
        super(length, width);
        this.stickinessFactor = stickinessFactor;
    }

    public int getStickinessFactor() {
        return stickinessFactor;
    }

    public void setStickinessFactor(int stickinessFactor) {
        this.stickinessFactor = stickinessFactor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stickiness Factor: " + stickinessFactor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        AdhesiveTape adhesiveTape = (AdhesiveTape) obj;
        return stickinessFactor == adhesiveTape.stickinessFactor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stickinessFactor);
    }
}

