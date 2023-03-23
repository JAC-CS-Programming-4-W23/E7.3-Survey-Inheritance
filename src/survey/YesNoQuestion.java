/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

package survey;

/**
 * Yes/No "questions" expect a "yes" or "no" as a response.
 */
public class YesNoQuestion extends Question {

    // Constructors

    public YesNoQuestion(String question) {
        this("", question, false);
    }

    public YesNoQuestion(String title, String question) {
        this(title, question, false);
    }

    public YesNoQuestion(String title, String question, boolean required) {
        super(title, question, required);
    }

    // Methods

    @Override
    public boolean isValidResponse(String response) {
        return response.equals("yes") || response.equals("no");
    }

    @Override
    public String prompt() {
        return "Just answer 'yes' or 'no', please.";
    }
}
