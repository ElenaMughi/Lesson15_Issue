package ru.netology.domain;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class IssueInfo {
    private int issueId;
    private String issueName;
    private Assignee Author;
    private boolean isOpen = true; // true - если открыто;
    private String fromProject;
    private String Milestones;
    private Set <Assignee> assigneeSet;
    private Set <Tag> issueTag;


}
