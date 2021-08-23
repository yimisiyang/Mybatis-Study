package cn.tj712.mapper;

import cn.tj712.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2021/8/22
 * @Time: 11:06
 * @author: ThinkPad
 */
public interface UserMapper {
    /**
     * 获取用户列表
     * @return
     */
    @Select("select * from mybatis.t_user")
    List<User> getUser();

}
