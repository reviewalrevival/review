package com.reviewal.revival.services;


import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Eugen on 27.08.2016.
 */
public class Main {
    private static String PASSWORD = "500m33gend3";

    public static void main(String[] args) {
        GitHub github = null;
        try {
            github = GitHub.connectUsingPassword("reviewalrevival",PASSWORD);
            GHRepository repo = github.getRepository("reviewalrevival/review");
            repo.getRefs();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
