/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

package survey;

/**
 * Long-answer style questions expect a response containing any amount of text.
 */
public class LongAnswerQuestion extends Question {

    // Constructors

    public LongAnswerQuestion(String question) {
        this("", question, false);
    }

    public LongAnswerQuestion(String title, String question) {
        this(title, question, false);
    }

    public LongAnswerQuestion(String title, String question, boolean required) {
        super(title, question, required);
    }

    // Methods

    @Override
    public boolean isValidResponse(String response) {
        return true;
    }

    @Override
    public String prompt() {
        return "Just write any text.";
    }
}
