import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogback {
    static Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    static Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    static Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    static Logger loggerError = LoggerFactory.getLogger("logger.error");

    public static void main(String[] args) {
        loggerDebug.debug("debug message");
        loggerInfo.info("info message");
        loggerWarn.warn("warn message");
        loggerError.error("error message");
    }
}
