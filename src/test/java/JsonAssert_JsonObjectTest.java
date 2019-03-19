import org.junit.Rule;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class JsonAssert_JsonObjectTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void JsonObjectIsEqualTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonObjectHasInvalidStructureTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonObjectHasDifferentKeysTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonObjectDifferentValuesTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonObjectHasDifferentKeyValuePairsTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void JsonObjectHasDifferentKeysAndDifferentValuesTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

}
