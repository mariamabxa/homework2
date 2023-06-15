import java.util.Objects;

class Game {
    private String name;
    private int maxPlayers;

    public Game(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String toString() {
        return "Game: " + name + ", Max Players: " + maxPlayers;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Game game = (Game) obj;
        return maxPlayers == game.maxPlayers && Objects.equals(name, game.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxPlayers);
    }
}

