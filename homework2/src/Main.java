public class Main {
    public static void main(String[] args) {
        Game game = new Game("Chess", 2);
        GameWithTimeLimit gameWithTimeLimit = new GameWithTimeLimit("Monopolly", 6, 100);
        Tape tape = new Tape(10, 5);
        VideoTape videoTape = new VideoTape(12, 8, 120);
        AdhesiveTape adhesiveTape = new AdhesiveTape(5, 1, 8);

        System.out.println(game.toString());
        System.out.println(gameWithTimeLimit.toString());
        System.out.println(tape.toString());
        System.out.println(videoTape.toString());
        System.out.println(adhesiveTape.toString());

        System.out.println(game.equals(gameWithTimeLimit));
        System.out.println(tape.equals(videoTape));
        System.out.println(videoTape.equals(adhesiveTape));

        System.out.println(game.hashCode());
        System.out.println(gameWithTimeLimit.hashCode());
        System.out.println(tape.hashCode());
        System.out.println(videoTape.hashCode());
        System.out.println(adhesiveTape.hashCode());
    }
}
