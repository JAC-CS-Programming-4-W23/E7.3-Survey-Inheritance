/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

package survey;

/**
 * Yes/No "questions" expect a "yes" or "no" as a response.
 */
public class YesNoQuestion implements Questionable {

    // Fields

    private final String title;
    private final String question;
    private final boolean required;

    // Constructors

    public YesNoQuestion(String question) {
        this("", question, false);
    }

    public YesNoQuestion(String title, String question) {
        this(title, question, false);
    }

    public YesNoQuestion(String title, String question, boolean required) {
        this.title = title;
        this.question = question;
        this.required = required;
    }

    // Methods

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public boolean isRequired() {
        return required;
    }

    @Override
    public boolean isValidResponse(String response) {
        return response.equals("yes") || response.equals("no");
    }

    @Override
    public String prompt() {
        return "Just answer 'yes' or 'no', please.";
    }
}
