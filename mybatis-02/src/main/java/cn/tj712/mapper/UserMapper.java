package cn.tj712.mapper;

import cn.tj712.pojo.User;

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
    List<User> getUserList();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 插入一个用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * 删除一个用户
     * @param id
     * @return
     */
    boolean delUser(int id);

    /**
     * 分页功能实现
     * @param map
     * @return
     */
    List<User> getUserByLimit(Map<String, Integer> map);

    /**
     * 通过RowBounds 实现分页
     * @return
     */
    List<User> getUserByRowBounds();

}
