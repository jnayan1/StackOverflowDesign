package com.example.stackoverflowdesign;

import java.util.Date;

public class Answer {
    private String answerId;
    private static int votes;
    private String text;
    private int views;
    private Date creationTime;
    private boolean isAccepted;

    private Member answerMember;

    private boolean incrementVoteCount() {
        return true;
    }

    private void updateVotes() {
        if(incrementVoteCount())
            votes+=1;
    }

}
