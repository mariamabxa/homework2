import java.util.Objects;

public class VideoTape extends Tape {
    private int playingTime;

    public VideoTape(int length, int width, int playingTime) {
        super(length, width);
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Playing Time: " + playingTime + " minutes";
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
        VideoTape videoTape = (VideoTape) obj;
        return playingTime == videoTape.playingTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), playingTime);
    }
}
