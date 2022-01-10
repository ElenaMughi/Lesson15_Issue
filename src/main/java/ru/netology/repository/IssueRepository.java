package ru.netology.repository;

import ru.netology.domain.IssueInfo;

import javax.sql.rowset.Predicate;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class IssueRepository {

    private Collection<IssueInfo> listOfIssue = new ArrayList<>();


    public IssueRepository(List<IssueInfo> listOfIssue) {
        this.listOfIssue = listOfIssue;
    }

    public IssueRepository() {
    }

    public Collection<IssueInfo> getAll() {
        return listOfIssue;
    }

    public void add(IssueInfo issue) {
        int last = listOfIssue.size() + 1;
        issue.setIssueId(last);
        listOfIssue.add(issue);
    }

    public void closeIssue(int id) {
        for (IssueInfo issue : listOfIssue) {
            if (issue.getIssueId() == id) {
                issue.setOpen(false);
            }
        }
    }

    public void reopenIssue(int id) {
        for (IssueInfo issue : listOfIssue) {
            if (issue.getIssueId() == id) {
                issue.setOpen(true);
            }
        }
    }

    public void filterByAuthor(String author, Predicate predicate) {
        List<IssueInfo> result = new ArrayList<IssueInfo>();
        result = listOfIssue.stream().filter(c -> c.getAuthor().equals(author));

//        for (IssueInfo issue : listOfIssue) {
//            if (!issue.equals(author)) {
//                result.add(issue);
//            }
//        }
        return result;
    }



}
