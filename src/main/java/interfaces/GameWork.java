package interfaces;

import enums.Signs;
import exceptions.UnsupportedSignException;
import players.Computer;
import players.User;

import java.io.IOException;

public interface GameWork {
    boolean checkGameContinue(Integer countGames, String playerChooseContinue);
    void finalWinner(User user, Computer computer);
    void winnerInRound(User user, Computer computer) throws UnsupportedSignException, IOException;
    Signs choose(Integer number) throws UnsupportedSignException, IOException;
}
