import java.util.Objects;

class GameWithTimeLimit extends Game {
    private int timeLimit;

    public GameWithTimeLimit(String name, int maxPlayers, int timeLimit) {
        super(name, maxPlayers);
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Time Limit: " + timeLimit + " minutes";
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
        GameWithTimeLimit game = (GameWithTimeLimit) obj;
        return timeLimit == game.timeLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), timeLimit);
    }
}

