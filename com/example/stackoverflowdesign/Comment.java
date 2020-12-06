package com.example.stackoverflowdesign;

import java.util.Date;

public class Comment {
    private String commentId;
    private String text;
    private static int votes;
    private int views;
    private Date creationDate;
    private Member commentUser;

    public boolean incrementVotes() {
        return true;
    }

    public void updateVotes() {
        if(incrementVotes())
            votes+=1;
    }
}
