import org.junit.Rule;

public abstract class AbstractJsonComparisonTest {

    public static String getActualJson() {
        String callerMethodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return MyResourceUtils.getResourceAsString("./" + callerMethodName + "/" + "actual.json");
    }

    public static String getExpectedJson() {
        String callerMethodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return MyResourceUtils.getResourceAsString("./" + callerMethodName + "/" + "expected.json");
    }

}
