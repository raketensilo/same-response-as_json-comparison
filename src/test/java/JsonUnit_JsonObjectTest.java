import org.junit.Rule;
import org.junit.Test;

import net.javacrumbs.jsonunit.JsonAssert;


public class JsonUnit_JsonObjectTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void JsonObjectIsEqualTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void JsonObjectHasInvalidStructureTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void JsonObjectHasDifferentKeysTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void JsonObjectDifferentValuesTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void JsonObjectHasDifferentKeyValuePairsTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void JsonObjectHasDifferentKeysAndDifferentValuesTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

}
