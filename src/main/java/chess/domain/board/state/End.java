package chess.domain.board.state;

import chess.domain.board.Rank;
import chess.domain.piece.Position;
import java.util.Map;

public abstract class End extends GameStarted {

    public End(Map<Integer, Rank> ranks) {
        super(ranks);
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public boolean isBlackTurn() {
        throw new IllegalStateException("게임이 끝나서 턴이 없습니다.");
    }

    @Override
    public BoardState move(Position start, Position target) {
        throw new IllegalStateException("게임이 끝나서 말을 움직일 수 없습니다.");
    }
}
