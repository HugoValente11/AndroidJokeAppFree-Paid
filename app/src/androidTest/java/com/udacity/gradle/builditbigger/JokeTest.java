package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.content.Intent;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;


@LargeTest
@RunWith(AndroidJUnit4.class)
public class JokeTest {

    @Rule
    public IntentsTestRule<MainActivity> mIntentTestRule = new IntentsTestRule<>(MainActivity.class);

    @Test
    public void cleanJokeTest()  {
        // Check if clean Button works
        onView(withId(R.id.cleanButton)).perform(click());
        intended(toPackage("com.udacity.gradle.builditbigger"));
        intended(hasExtra(equalTo(Intent.EXTRA_TEXT), notNullValue()));
    }
    @Test
    public void dirtyJokeTest()  {
        // Check if clean Button works
        onView(withId(R.id.dirtyButton)).perform(click());
        intended(toPackage("com.udacity.gradle.builditbigger"));
        intended(hasExtra(equalTo(Intent.EXTRA_TEXT), notNullValue()));
    }
}
