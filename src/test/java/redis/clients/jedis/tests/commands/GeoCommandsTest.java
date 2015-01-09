package redis.clients.jedis.tests.commands;

import org.junit.Test;

/**
 * Created by rahul on 8/1/15.
 */
public class GeoCommandsTest extends JedisCommandTestBase {

    @Test
    public void geoadd(){
        long status = jedis.geoadd("1.2,111.4",1.245,111.456,"test");
        assertEquals(1,status);
        status = jedis.geoadd("1.2,111.4",1.245,111.456,"test");
        assertEquals(0,status);

    }
}
