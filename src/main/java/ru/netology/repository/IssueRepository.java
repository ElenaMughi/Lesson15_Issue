package ru.netology.repository;

import ru.netology.domain.IssueInfo;

import java.util.ArrayList;
import java.util.List;

public class IssueRepository {
    private List<IssueInfo> listOfIssue= new ArrayList <> ();

    public List<IssueInfo> getAll(){
        return listOfIssue;
    }
}
