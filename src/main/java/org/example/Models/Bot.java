package org.example.Models;

import java.util.List;

public class Bot extends Player{
    private BotDifficulty botDifficulty;


    public Bot(String name, Symbol symbol, PlayerType playerType, BotDifficulty botDifficulty) {
        super(name, symbol, playerType);
        this.botDifficulty = botDifficulty;

    }

    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row: board.getBoard()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    System.out.println("BOT turn");
                    return new Move(cell,this);
                }
            }
        }

        return null;
    }
}
