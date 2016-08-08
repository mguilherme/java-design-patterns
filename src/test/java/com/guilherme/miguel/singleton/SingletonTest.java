package com.guilherme.miguel.singleton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

/**
 * @author Miguel Guilherme
 */
public class SingletonTest {

    @Test
    public void shouldRetrieveSameInstance() throws Exception {
        Singleton obj1 = Singleton.getInstance();
        obj1.setMessage("Demo Message");
        Singleton obj2 = Singleton.getInstance();

        assertThat(obj1, is(sameInstance(obj2)));
        assertThat(obj2.getMessage(), is(equalTo(obj1.getMessage())));
    }

}