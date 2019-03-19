import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static uk.co.datumedge.hamcrest.json.SameJSONAs.sameJSONAs;

public class HamcrestJson_JsonObjectTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void JsonObjectIsEqualTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void JsonObjectHasInvalidStructureTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void JsonObjectHasDifferentKeysTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void JsonObjectDifferentValuesTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void JsonObjectHasDifferentKeyValuePairsTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void JsonObjectHasDifferentKeysAndDifferentValuesTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

}
