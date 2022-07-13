package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static Logger log = LogManager.getLogger(AppTest.class);
    /**
     * Rigorous Test :-)
     */
//    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void test1() {
        log.info("啦啦啦啦啦");
        log.debug("啦啦啦啦啦");
        log.error("啦啦啦啦啦");
    }
}
