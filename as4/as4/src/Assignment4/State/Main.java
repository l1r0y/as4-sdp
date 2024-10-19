package Assignment4.State;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();    // Starting player
        player.pause();   // Pausing player
        player.play();    // Resuming player
        player.stop();    // Stopping player
    }
}