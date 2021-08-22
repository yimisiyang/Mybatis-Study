package cn.tj712.mapper;

import cn.tj712.pojo.User;

import java.util.List;

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
    List<User> getUserList();
}
