package rozetka;

import org.apache.log4j.Logger;

public class Log4j {
    private static final Logger logger = Logger.getLogger(Log4j.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}
