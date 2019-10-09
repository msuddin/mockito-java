package com.thetestroom;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EndpointTest {

    @Test
    public void shouldGetExpectedGreetingFromExternalExampleEndpoint() {
        // Given
        ExternalExampleEndpoint externalExampleEndpoint = mock(ExternalExampleEndpoint.class);
        when(externalExampleEndpoint.sayHi()).thenReturn("Hello");

        // Then
        assertThat(externalExampleEndpoint.sayHi(), is("Hello"));
    }

    @Test
    public void shouldGetExpectedGreetingFromMyExampleEndpoint() {
        // Given
        ExternalExampleEndpoint externalExampleEndpoint = mock(ExternalExampleEndpoint.class);
        when(externalExampleEndpoint.sayHi()).thenReturn("Hello");

        // Then
        MyExampleEndpoint myExampleEndpoint = new MyExampleEndpoint();
        assertThat(myExampleEndpoint.sayHi(externalExampleEndpoint), is("Hello"));
    }
}
