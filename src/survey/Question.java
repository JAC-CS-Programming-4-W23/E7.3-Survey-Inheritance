package survey;

public class Question {
    private String title;
    protected String question;
    private boolean isRequired;

    public Question(String title, String question, boolean isRequired) {
        this.title = title;
        this.question = question;
        this.isRequired = isRequired;
    }

    public String getTitle() {
        return title;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public boolean isValidResponse(String response) {
        return false;
    }

    public String prompt() {
        return "";
    }
}
