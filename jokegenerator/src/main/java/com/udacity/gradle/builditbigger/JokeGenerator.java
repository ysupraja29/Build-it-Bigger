package com.udacity.gradle.builditbigger;

import java.util.Random;

public class JokeGenerator {

    String[] funnyJokes = {"Q: Why was six scared of seven? \n" +
            "A: Because seven \"ate\" nine.",
            "Q: Can a kangaroo jump higher than the Empire State Building? \n" +
                    "A: Of course. The Empire State Building can't jump.",
            "Instead of \"the John,\" I call my toilet \"the Jim.\" That way it sounds better when I say I go to the Jim first thing every morning.", "Q: What is the difference between snowmen and snowwomen? \n" +
            "A: Snowballs."};


    public String getJoke() {
        Random generator = new Random();
        int jokeIndex = generator.nextInt(funnyJokes.length);
        String retrievedJoke = funnyJokes[jokeIndex];
        return retrievedJoke;
    }
}
