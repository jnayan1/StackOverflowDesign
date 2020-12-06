package com.example.stackoverflowdesign;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(Identifiers.AccountStatus.ACTIVE);
    }
}

// Important classes in Stack Overflow Design
// 1. Question: Main component, title, tag, Description, posed by user, views, votes, answers, comments/conclusion
// 2. Answer: Answer of which question, answer by which user, status (flagged, accepted and so on), votes, views
// 3. Comment: Similar to answer, except for the status (maybe, but mostly for clarification / discussion )
// 4. Tag: Categorize a question, and small hidden description of their own, used to analytics
// 5. Account: We divide the users. a. Guest, b. Member, c. Moderator, d. Admin
// 6. System: Responsible for notifications and ir assigning badge to users and track reputation
