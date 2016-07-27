/**
 * Created by kevin on 2015/11/13.
 */

import com.alibaba.fastjson.JSON;
import com.cn.wx.model.Tag;
import com.cn.wx.service.TagService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    private ApplicationContext ac = null;
    private TagService tagService = null;

  @Before
  public void before() {
      ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-service.xml",
              "classpath:spring-mybatis.xml");
      tagService = (TagService) ac.getBean("tagService");
  }

    @Test
    public void test1() {
        List<Tag> tagList = tagService.queryResTagRelation("61f6c0d47a6542468b9d7f9ac5afcf66");

        logger.info(JSON.toJSON(tagList.get(0)));
    }
}

