import org.junit.Rule;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import static org.hamcrest.MatcherAssert.assertThat;
import static uk.co.datumedge.hamcrest.json.SameJSONAs.sameJSONAs;


public class JsonAssert_PrimitiveTypeTest extends AbstractJsonComparisonTest {

    private static final String className = new Object(){}.getClass().getEnclosingClass().getSimpleName();
    @Rule
    public JUnitAssertionErrorLogger logger = new JUnitAssertionErrorLogger().init().setLogFileName(className);

    @Test
    public void PrimitiveTypeIsEqualTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void PrimitiveTypeBooleanIsDifferentTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void PrimitiveTypeStringIsDifferentTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

    @Test
    public void PrimitiveTypeIntegerIsDifferentTest() {
        JSONAssert.assertEquals(
                getExpectedJson(),
                getActualJson(),
                JSONCompareMode.LENIENT
        );
    }

}
