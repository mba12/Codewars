package com.michaelahern;

import junit.framework.TestCase;
import org.junit.Test;

public class TimeFormatterTest extends TestCase {

    @Test
    public void exampleTests() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

}