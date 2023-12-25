package hexlet.code.games;

public final class GameRound {
    private final String question;
    private final String answer;

    GameRound(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
