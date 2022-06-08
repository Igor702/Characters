package com.example.scrollcharacters.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.scrollcharacters.MainActivity
import com.example.scrollcharacters.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

@SmallTest
class CharactersFragmentTest{




    @get:Rule
    var fragmentRule:ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun `check_first_position`(){

    onView(withText("Rick Sanchez")).check(matches(isDisplayed()))
}

    @Test
    fun `scroll_to_last_position`(){
        onView(withId(R.id.recycler_view)).perform(scrollToPosition<RecyclerView.ViewHolder>(1))
        onView(withText("Meeseeks")).check(matches(withText("Meeseeks")))
    }

}