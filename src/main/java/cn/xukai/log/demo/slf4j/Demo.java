package cn.xukai.log.demo.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kaixu on 2017/9/11.
 */
public class Demo {
    private static Logger logger = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) {
        logger.trace("trace...........");
        logger.debug("debug..............");
        logger.info("info...............");
        logger.warn("warn...................");
        logger.error("error.................");
    }
}
