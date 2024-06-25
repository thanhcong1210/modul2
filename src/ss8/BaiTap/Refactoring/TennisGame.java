package ss8.BaiTap.Refactoring;

public class TennisGame {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static String getScore(int playScore1, int playScore2) {
        String score = "";
        int tempScore = ZERO;
        if (playScore1 == playScore2) {
            score = switch (playScore1) {
                case ZERO, ONE, TWO, THREE -> getScoreString(playScore1) + "_AAL";
                default -> "Deuce";
            };

        } else if (playScore1 >= 4 || playScore2 >= 4) {
            int companer = playScore1 - playScore2;

            if (companer > 0) {
                if (companer > 1) {
                    score = "Win for player1";
                } else {
                    score = "Advantage player1";
                }
            } else {
                if (companer < -1) {
                    score = "Win for player2";
                } else {
                    score = "Advantage player2";
                }
            }

        } else {
            score = getScoreString(playScore1) + " - " + getScoreString(playScore2);
        }
        return score;
    }

    public static String getScoreString(int checkScore) {
        return switch (checkScore) {
            case ZERO -> "Love";
            case ONE -> "Fifteen";
            case TWO -> "Thirty";
            case THREE -> "Forty";
            default -> "";
        };
    }
}
