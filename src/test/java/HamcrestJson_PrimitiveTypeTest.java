import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static uk.co.datumedge.hamcrest.json.SameJSONAs.sameJSONAs;


public class HamcrestJson_PrimitiveTypeTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void PrimitiveTypeIsEqualTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void PrimitiveTypeBooleanIsDifferentTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void PrimitiveTypeStringIsDifferentTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

    @Test
    public void PrimitiveTypeIntegerIsDifferentTest() {
        assertThat(
                getActualJson(),
                sameJSONAs(getExpectedJson())
        );
    }

}
