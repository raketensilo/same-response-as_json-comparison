import org.junit.Rule;
import org.junit.Test;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;


public class JsonAssert_JsonArrayTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void JsonArrayIsEqualTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonArrayHasInvalidStructureTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonArrayHasDifferentNumberOfElementsTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonArrayHasDifferentOrderOfElementsTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

}
