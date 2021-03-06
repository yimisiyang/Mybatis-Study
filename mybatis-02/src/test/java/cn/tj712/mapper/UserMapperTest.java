package cn.tj712.mapper;

import cn.tj712.pojo.User;
import cn.tj712.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/22
 * @Time: 17:12
 * @author: ThinkPad
 */
public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void testGetUserList(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        //方式1：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        //遍历列表
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info: 进入了testLog4j方法");
        logger.debug("debug: 进入了testLog4j");
        logger.error("error: 进入了log4j");
    }
}
