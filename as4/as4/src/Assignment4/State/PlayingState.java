package Assignment4.State;

public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Pausing the player.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping the player.");
        player.setState(new StoppedState());
    }
}