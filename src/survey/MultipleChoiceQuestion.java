/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

package survey;

/**
 * Multiple choice questions expect a, b, c, or d as a response.
 */
public class MultipleChoiceQuestion implements Questionable {

    // Fields

    private final String title;
    private String question;
    private final boolean required;

    // Constructors

    public MultipleChoiceQuestion(String question) {
        this("", question, false);
    }

    public MultipleChoiceQuestion(String title, String question) {
        this(title, question, false);
    }

    public MultipleChoiceQuestion(String title, String question, boolean required) {
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
        return response.equals("a") || response.equals("b") || response.equals("c") || response.equals("d");
    }

    @Override
    public String prompt() {
        return "Answer a, b, c, or d please.";
    }

    public void addChoice(String choice) {
        this.question += '\n' + choice;
    }
}
