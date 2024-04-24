package org.example.Controller;

import org.example.Exception.InvalidMoveException;
import org.example.Models.Game;
import org.example.Models.GameState;
import org.example.Models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimenstion, List<Player> players){
        return new Game(dimenstion, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove(game);
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }



    public void printBoard(Game game){
        game.printBoard();
    }



}
