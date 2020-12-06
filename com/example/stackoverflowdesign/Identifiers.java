package com.example.stackoverflowdesign;

public class Identifiers {

    public enum QuestionStatus {
        CLOSED,
        OPEN,
        ON_HOLD,
        DELETED;
    }

    public enum QuestionClosingRemarks {
        DUPLICATE,
        OFF_TOPIC,
        PRIMARILY_OPINION_BASED,
        NOT_A_REAL_QUESTION,
        VIOLATIONS;
    }

    public enum AccountStatus {
        ACTIVE,
        CLOSED,
        CANCELED,
        BLACKLISTED,
        BLOCKED;
    }
}
