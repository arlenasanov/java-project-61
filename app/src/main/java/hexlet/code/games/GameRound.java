package hexlet.code.games;

public final class GameRound {
    private final String question;
    private final String answer;

    GameRound(String q, String a) {
        question = q;
        answer = a;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
