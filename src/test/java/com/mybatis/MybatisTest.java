package com.mybatis;

import org.apache.ibatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author yangyang.jiang
 * @Description:
 * @create 2020/8/17
 * @time 9:51 上午
 */
public class MybatisTest {

  @Test
  public void test() throws FileNotFoundException {
    InputStream in = new FileInputStream("/Users/yigu/IdeaProjects/mybatis/src/main/resources/Mybatis-conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    mapper.selectList().forEach(System.out::println);
  }
}
