package com.michaelahern;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareRootTest {

    @Test
    public void test5() {
        assertEquals("1", SquareRoot.integerSquareRoot("1"));
        assertEquals("2", SquareRoot.integerSquareRoot("5"));
        assertEquals("4", SquareRoot.integerSquareRoot("17"));
        assertEquals("10", SquareRoot.integerSquareRoot("100"));
        assertEquals("31", SquareRoot.integerSquareRoot("1000"));
        assertEquals("152421548093487868711992623730429930751178496967",
                SquareRoot.integerSquareRoot("23232328323215435345345345343458098856756556809400840980980980980809092343243243243243098799634"));
        assertEquals("3510457208086937291253621317073222057793129",
                SquareRoot.integerSquareRoot("12323309809809534545458098709854808654685688665486860956865654654654324238000980980980"));
    }



}