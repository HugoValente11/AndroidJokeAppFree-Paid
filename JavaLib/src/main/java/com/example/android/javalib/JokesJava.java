package com.example.android.javalib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesJava {
    private List<String> cleanJokes;
    private List<String> dirtyJokes;


    public JokesJava() {
        cleanJokes = new ArrayList<>();

        cleanJokes.add("A Mexican magician says he will disappear on the count of 3. He says \"uno, dos...\" poof. He disappeared without a tres.");
        cleanJokes.add("I have a Polish friend who's a sound technician. Oh, and a Czech one too. Czech one too. Czech one too.");
        cleanJokes.add("A woman walks into a library and asked if they had any books about paranoia.\n" +
                "\n" +
                "Librarian: \"They're right behind you!!\".");
        cleanJokes.add("A Mexican magician says he will disappear on the count of 3. He says \"uno, dos...\" poof. He disappeared without a tres.");
        cleanJokes.add("A man walks into a library and orders fish and chips.\n" +
                "\n" +
                "The librarian says, \"this is a library.\"\n" +
                "\n" +
                "The man, says, \"oh. Sorry.\" (Then in a whisper) \"I'd like some fish and chips.\"");
        cleanJokes.add("Do you use your right hand to stir your coffee? Huh. I use a spoon.");
        cleanJokes.add("How does a rabbi make his coffee?\n" +
                "\n" +
                "Hebrews it.");
        cleanJokes.add("Dr Frankenstein entered a body building contest. Upon arrival he realised he misunderstood the objective.");
        cleanJokes.add("Why do blind people hate skydiving?\n" +
                "\n" +
                "It scares the hell out of their dogs.");
        cleanJokes.add("A Ham Sandwich walks into a bar. The bartender says \"I'm sorry, We don't serve food here\".");
        cleanJokes.add("What's red and bad for your teeth?\n" +
                "\n" +
                "A Brick.");
        cleanJokes.add("A Roman walks into a bar, holds up two fingers and says \"I'll have five beers\"\n" +
                "\n" +
                "A Roman walks into a bar and orders a Martinus. \"Don't you mean Martini?\" Asks the bartender. The Roman says \"No, just the one\"");
        cleanJokes.add("Why did the cat fall into the well?\n" +
                "\n" +
                "It couldn't see that well.");
        cleanJokes.add("Why do Scuba divers fall backwards off the boat?\n" +
                "\n" +
                "Because if they fell forward they'd still be in the boat.");
        cleanJokes.add("You have to stay fit. My gran started walking 5 miles a day when she turned 60. Now shes 97 and we dont know where the hell she is.");

        dirtyJokes = new ArrayList<>();
        dirtyJokes.add("What did the leper say to the whore?\n" +
                "\n" +
                "Keep the tip.");
        dirtyJokes.add("A family walks into a hotel and the father goes to the front desk and he says \"I hope the porn is disabled.\" The guy at the desk replies. \"It's just regular porn you sick fuck.\"");
        dirtyJokes.add("My buddy told me that he's been sleeping with twins and the sex is amazing..\n" +
                "\n" +
                "I said that's awesome, but how do you tell them apart?\n" +
                "\n" +
                "\"Well Diane's got nice firm tits and a shaved pussy...and Peter's got a moustache\"");
        dirtyJokes.add("What did Cinderella do when she got to the ball?\n" +
                "\n" +
                "She gagged.");
        dirtyJokes.add("How can you spot a blind man at a nude beach?\nIt isn't hard.");
    }

    public String randomCleanJoke () {
        Random random = new Random();
        int randomPosition = random.nextInt(cleanJokes.size());
        return cleanJokes.get(randomPosition);
    }

    public String randomDirtyJoke () {
        Random random = new Random();
        int randomPosition = random.nextInt(dirtyJokes.size());
        return dirtyJokes.get(randomPosition);
    }
}
