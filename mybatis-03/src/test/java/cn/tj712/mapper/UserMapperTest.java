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
    @Test
    public void testGetUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUser();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
