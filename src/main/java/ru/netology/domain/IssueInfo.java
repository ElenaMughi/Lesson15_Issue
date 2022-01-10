package ru.netology.domain;

import lombok.*;

import java.util.Comparator;
import java.util.Set;
import java.util.function.Predicate;

@NoArgsConstructor
@Data

public class IssueInfo implements Predicate<IssueInfo>, Comparator<IssueInfo> {
    private int issueId; // присваивается автоматически при добавлении нового
    private String issueName;
    private Assignee author;
    private boolean isOpen = true; // true - если открыто; при добавлении нового всегда открыто
    private String fromProject;
    private String milestones;
    private Set <Assignee> assigneeSet;
    private Set <Tag> issueTag;


    public IssueInfo(String issueName, Assignee author, String fromProject, String milestones, Set<Assignee> assigneeSet, Set<Tag> issueTag) {
        this.issueName = issueName;
        this.author = author;
        this.fromProject = fromProject;
        this.milestones = milestones;
        this.assigneeSet = assigneeSet;
        this.issueTag = issueTag;
    }

    @Override
    public boolean test(IssueInfo issueInfo) {
       return this.author == issueInfo.getAuthor();
    }

    @Override
    public int compare(IssueInfo o1, IssueInfo o2) {
        return o1.getIssueId() - o2.getIssueId();
    };
}
