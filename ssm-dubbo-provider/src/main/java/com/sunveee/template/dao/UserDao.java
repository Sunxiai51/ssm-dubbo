package com.sunveee.template.dao;

import java.util.List;

import com.sunveee.template.model.User;
import com.sunveee.template.util.PageEntity;

public interface UserDao {
    public User selectById(Integer id);

    public int deleteById(Integer id);

    public List<User> selectUserPage(PageEntity pageEntity);

    public Integer countAll();

}
