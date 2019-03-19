import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.text.StringEscapeUtils;

public class JUnitAssertionErrorLogger extends TestWatcher {

    private static final String BASEPATH_DEFAULT = "./src/test/resources";
    private static final String ASSERTIONERROR_FILENAME_DEFAULT = "AssertionErrors";
    private static final String ASSERTIONERROR_FILENAME_SUFFIX = ".txt";

    private static String basePath;
    private static String logFileName;

    public JUnitAssertionErrorLogger init() {
        setBasePath(BASEPATH_DEFAULT);
        setLogFileName(ASSERTIONERROR_FILENAME_DEFAULT);

        return this;
    }

    public JUnitAssertionErrorLogger setBasePath(String basePath) {

        if (basePath.endsWith("/")) {
            basePath = basePath.substring(0, basePath.length() - 1);
        }

        this.basePath = basePath;

        return this;
    }

    public JUnitAssertionErrorLogger setLogFileName(String logfileName) {
        this.logFileName = logfileName + ASSERTIONERROR_FILENAME_SUFFIX;

        return this;
    }

    @Override
    public void succeeded(Description description) {
        String fileName = basePath
                + "/" + description.getMethodName()
                + "/" + logFileName;

        File f = new File(fileName);
        if (f.exists()) {
            f.delete();
        }

        super.succeeded(description);
    }

    @Override
    public void failed(Throwable e, Description description) {

        String fileName = basePath
                + "/" + description.getMethodName()
                + "/" + logFileName;

        String output = MyStringUtils.
                useSystemLineSeparator(
                        StringEscapeUtils.unescapeJava(e.getMessage())
                );

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName, false);
            byte[] strToBytes = output.getBytes();
            outputStream.write(strToBytes);
        } catch(IOException ioe) {
            ioe.printStackTrace();
            throw new RuntimeException(ioe);
        }

        super.failed(e, description);
    }

}
