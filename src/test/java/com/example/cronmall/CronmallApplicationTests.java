package com.example.cronmall;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cronmall.entity.User;
import com.example.cronmall.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class CronmallApplicationTests {
    @Autowired
    private UserMapper userMapper;

    // 查询User表中的所有数据
    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setAge(20);
        user.setEmail("222@qq.com");
        user.setName("e");
        userMapper.insert(user);
    }

    @Test
    public void updateUser() {

        User user = userMapper.selectById(1555955075212390402L);
        user.setId(1555955075212390402L);
        user.setAge(90);

        userMapper.updateById(user);
    }

    @Test
    public void testSelectDemo1() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
        System.out.println(users);
    }

    @Test
    public void testSelectByMap() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "erer");
        map.put("age", "20");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    @Test
    public void testPage() {
        //1.创建配置对象
        // 传入两个参数，当前页和每页显示记录数
        Page<User> page = new Page<>(1, 3);
        // 调用mp分页查询过程中，底层封装
        // 把分页所有数据封装到page对象里面
        userMapper.selectPage(page, null);
        // 通过page对象获取分页数据
        System.out.println(page.getCurrent());
        // 每页数据的list集合
        System.out.println(page.getRecords());
        System.out.println(page.getSize());// 每页显示记录数
        System.out.println(page.getPages());//总页数
        System.out.println(page.hasNext());//是否有下一页
        System.out.println(page.hasPrevious());// 是否有上一页
    }

    /**
     * 根据id做删除
     */
    @Test
    public void testDeleteById() {
        userMapper.deleteById(1556251530733064194L);
    }

    /**
     * 批量删除
     */
    @Test
    public void testDeleteBatchById() {
        userMapper.deleteBatchIds(Arrays.asList(1555955075212390402L,1556251830583844866L));
    }

    /**
     * 逻辑删除
     */
    @Test
    public void testDeletedById(){
        userMapper.deleteById(1556252175632543746L);
    }

    /**
     * 查询已经逻辑删除的数据
     */
    @Test
    public void testSelectById(){
        // 查询不到已经删除的数据，如果需求有查询删除的数据，需要自己写sql
        userMapper.selectById(1556252175632543746L);

    }

    /**
     * mp实现复杂查询操作
     */
    @Test
    public void testSelectQuery(){
        // 创建QueryWrapper对象
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // 通过queryWrapper设置条件  ge/gt/lt/gt/eq/ne/like/ orderByDesc/last
        // 查age>=20的数据  第一个参数字段名称，第二个参数设置值
//        wrapper.ge("age",30);
        // 查询name等于erer的数据
//        wrapper.eq("name","erer");
        // 查询name不等于erer
//        wrapper.ne("name","erer");
        // 查询年龄在20-30之间的数据
//        wrapper.between("age","20","30");
        // 查询name中包含e的
//        wrapper.like("name","e");
        //根据id降序排序
        wrapper.orderByDesc("id");
        //拼接sql
        wrapper.last("limit 1");

        // 查询指定的列
        // 只查询两列：id和name
        wrapper.select("id","name");

        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }






}
