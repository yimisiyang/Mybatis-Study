package cn.tj712.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Date: 2021/8/22
 * Time: 10:35
 * @author ThinkPad
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //使用myBatis获取sqlSessionFactory对象
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    /**
     * 获取selSession的实例，sqlSession完全包含了面向数据库执行命令所需的所有方法
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
