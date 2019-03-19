import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static uk.co.datumedge.hamcrest.json.SameJSONAs.sameJSONAs;

public class HamcrestJson_JsonArrayTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void JsonArrayIsEqualTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson()).allowingAnyArrayOrdering()
        );
    }

    @Test
    public void JsonArrayHasInvalidStructureTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson()).allowingAnyArrayOrdering()
        );
    }

    @Test
    public void JsonArrayHasDifferentNumberOfElementsTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson()).allowingAnyArrayOrdering()
        );
    }

    @Test
    public void JsonArrayHasDifferentOrderOfElementsTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson()).allowingAnyArrayOrdering()
        );
    }

}
