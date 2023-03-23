/*
 * Copyright (c) 2022 Ian Clement. All rights reserved.
 */

package survey;

/**
 * Short-answer style questions expect a response containing a limited length of text.
 */
public class ShortAnswerQuestion extends Question {

    private static final int DEFAULT_LENGTH = 128;

    private int limit;

    // Constructors

    public ShortAnswerQuestion(String question) {
        this("", question, DEFAULT_LENGTH, false);
    }

    public ShortAnswerQuestion(String title, String question) {
        this(title, question, DEFAULT_LENGTH, false);
    }

    public ShortAnswerQuestion(String title, String question, boolean required) {
        this(title, question, DEFAULT_LENGTH, required);
    }

    public ShortAnswerQuestion(String title, String question, int limit) {
        this(title, question, limit, false);
    }

    public ShortAnswerQuestion(String title, String question, int limit, boolean required) {
        super(title, question, required);

        this.limit = limit;
    }

    // Methods

    @Override
    public boolean isValidResponse(String response) {
        return response.trim().length() <= limit;
    }

    @Override
    public String prompt() {
        return String.format("Please answer the question with at most %d characters.", limit);
    }
}
