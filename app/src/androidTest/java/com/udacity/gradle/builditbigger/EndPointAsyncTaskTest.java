package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
/**
 * Created by kev on 3/21/16.
 */

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        com.udacity.gradle.builditbigger.MainActivityFragment fragment = new com.udacity.gradle.builditbigger.MainActivityFragment();
        fragment.testFlag = true;
        new EndpointAsyncTask().execute(fragment);
        Thread.sleep(5000);
        assertTrue("Error: Fetched Joke = " + fragment.loadedJoke, fragment.loadedJoke != null);
    }
}
