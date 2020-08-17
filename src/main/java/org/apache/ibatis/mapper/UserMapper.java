package org.apache.ibatis.mapper;

import org.apache.ibatis.domain.User;

import java.util.List;

/**
 * @author yangyang.jiang
 * @Description:
 * @create 2020/8/17
 * @time 9:54 上午
 */
public interface UserMapper {
  List<User> selectList();
}
