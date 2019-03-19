import org.junit.Rule;
import org.junit.Test;

import net.javacrumbs.jsonunit.JsonAssert;
import net.javacrumbs.jsonunit.core.Option;

public class JsonUnit_JsonArrayTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void JsonArrayIsEqualTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson(),
                JsonAssert.when(Option.IGNORING_ARRAY_ORDER)
        );
    }

    @Test
    public void JsonArrayHasInvalidStructureTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson(),
                JsonAssert.when(Option.IGNORING_ARRAY_ORDER)
        );
    }

    @Test
    public void JsonArrayHasDifferentNumberOfElementsTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson(),
                JsonAssert.when(Option.IGNORING_ARRAY_ORDER)
        );
    }

    @Test
    public void JsonArrayHasDifferentOrderOfElementsTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson(),
                JsonAssert.when(Option.IGNORING_ARRAY_ORDER)
        );
    }

}
