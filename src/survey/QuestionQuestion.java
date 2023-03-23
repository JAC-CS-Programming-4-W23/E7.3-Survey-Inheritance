/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

package survey;

/**
 * Question "questions" expect a question as a response, so something ending in a '?'.
 */
public class QuestionQuestion extends Question {

    // Constructors

    public QuestionQuestion(String question) {
        this("", question, false);
    }

    public QuestionQuestion(String title, String question) {
        this(title, question, false);
    }

    public QuestionQuestion(String title, String question, boolean required) {
        super(title, question, required);
    }

    // Methods

    @Override
    public boolean isValidResponse(String response) {
        response = response.trim();
        return response.endsWith("?");
    }

    @Override
    public String prompt() {
        return "Just give us a question ending with a '?'";
    }
}
