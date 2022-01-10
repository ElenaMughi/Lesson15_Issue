package ru.netology.manager;

import ru.netology.domain.IssueInfo;
import ru.netology.repository.IssueRepository;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {

    private IssueRepository repository = new IssueRepository();

    public void addIssue(IssueInfo issue) {
        repository.add(issue);
    }

    public void closeIssue(int id) {
        repository.closeIssue(id);
    }

    public List<IssueInfo> getAllOpen() {
        List<IssueInfo> allIsOpen = new ArrayList<IssueInfo>();
        for (IssueInfo Issue : repository.getAll()) {
            if (Issue.isOpen()) {
                allIsOpen.add(Issue);
            }
        }
        return allIsOpen;
    }

    public List<IssueInfo> getAllClosed() {
        List<IssueInfo> allIsClose = new ArrayList<IssueInfo>();
        for (IssueInfo issue : repository.getAll()) {
            if (!issue.isOpen()) {
                allIsClose.add(issue);
            }
        }
        return allIsClose;
    }

    public List<IssueInfo> sortById(Comparator<IssueInfo> comparator) {
        ArrayList<IssueInfo> out = repository.getAll();
        Arrays.sort(out, comparator);
        return out;
    }
}
