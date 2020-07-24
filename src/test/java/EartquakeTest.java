/**
 * Print out total number of babies born, as well as for each gender, in a given CSV file of baby name data.
 *
 * @author Samet Burç
 */

import de.fhpotsdam.unfolding.marker.Marker;
import earthquakeModule.EarthquakeCityMap;
import earthquakeModule.EarthquakeMarker;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class EartquakeTest {

    EarthquakeCityMap map;

    @Before
    public void init() throws Exception {

        map = new EarthquakeCityMap();

        Method method = EarthquakeCityMap.class.getDeclaredMethod("loadRssFeed", null);
        method.setAccessible(true);
        method.invoke(map);
    }

    @Test
    public void testSortAndPrint() throws Exception {

        Method method = EarthquakeCityMap.class.getDeclaredMethod("sortAndPrint", int.class);
        method.setAccessible(true);
        method.invoke(map, 10);

    }


}
