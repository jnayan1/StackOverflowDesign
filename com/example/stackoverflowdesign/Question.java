package com.example.stackoverflowdesign;

import java.util.Date;
import java.util.List;

public class Question implements Search{

    private String questionId;
    private String title;
    private String description;
    private static int votes;
    private int views;
    private Date creationDateTime;
    private Date lastUpdateDateTime;

    private Member questionUser;
    private List<Answer> answerList;
    private List<Comment> commentList;
    public static List<Question> search(String Query) {
        List<Question> results = null;
        return results;
    }
}
