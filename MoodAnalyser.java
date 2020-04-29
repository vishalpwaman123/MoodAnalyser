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


}
