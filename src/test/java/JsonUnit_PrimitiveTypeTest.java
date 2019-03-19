import net.javacrumbs.jsonunit.JsonAssert;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static uk.co.datumedge.hamcrest.json.SameJSONAs.sameJSONAs;


public class JsonUnit_PrimitiveTypeTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void PrimitiveTypeIsEqualTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void PrimitiveTypeBooleanIsDifferentTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void PrimitiveTypeStringIsDifferentTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

    @Test
    public void PrimitiveTypeIntegerIsDifferentTest() {
        JsonAssert.assertJsonEquals(
                getExpectedJson(),
                getActualJson()
        );
    }

}
