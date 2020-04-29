package com.Mood;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyser {
    @Test
    public void MoodAnalyser_returnSad() {
        Moodanalysertest MoodA=new Moodanalysertest();
        String result=MoodA.varificationSadTest("Your Mood Are Sad");
        Assert.assertEquals("SAD",result);
    }

    @Test
    public void MoodAnalyser_returnHappy() {
        Moodanalysertest MoodA=new Moodanalysertest();
        String result=MoodA.varificationHappyTest("Your Mood Are Happy");
        Assert.assertEquals("HAPPY",result);
    }	

}
