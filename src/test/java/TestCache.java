import com.cn.wx.cache.RedisCache;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: kevin.
 * @date: 2016/7/28.
 * @package: PACKAGE_NAME.
 * @version: 1.0.0.
 * @description:
 */
public class TestCache {

    private static Logger logger = Logger.getLogger(TestMybatis.class);
    private ApplicationContext ac = null;
    private CacheManager cacheManager;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("classpath*:applicationContext-redis.xml");
    }

    @Test
    public void test1() {
        /*cacheManager = (CacheManager)ac.getBean("cacheManager");
        RedisCache cache = (RedisCache)cacheManager.getCache("default");
        cache.put("a","test1");*/

    }

    public CacheManager getCacheManager() {
        return cacheManager;
    }

    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }
}
