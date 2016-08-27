package com.reviewal.revival.services;

import com.backendless.servercode.IBackendlessService;
import com.reviewal.revival.models.CommitObject;
import org.eclipse.jgit.lib.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugen on 26.08.2016.
 */
public class CommitService implements IBackendlessService {
    public CommitService() {
    }

    public List<CommitObject> getAllCommits(String SSID, String repository){
        List<CommitObject> commits=new ArrayList<CommitObject>();
        commits.add(new CommitObject("Uriy","3242fw4","uriyrepository"));
        commits.add(new CommitObject("Gennadiy","@3423424d","gennadiyrepository"));
        return commits;
    }
    public void testFoo(){
        Repository rep;
    }

}
