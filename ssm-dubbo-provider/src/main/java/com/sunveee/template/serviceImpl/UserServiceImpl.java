package com.sunveee.template.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunveee.template.dao.UserDao;
import com.sunveee.template.model.User;
import com.sunveee.template.service.UserService;
import com.sunveee.template.util.PageEntity;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public User getUserById(int userId) {
        return this.userDao.selectById(userId);
    }

    @Override
    public List<User> getUserPage(int pageNo, int pageSize) {
        return this.userDao.selectUserPage(new PageEntity(pageNo, pageSize));
    }

    @Override
    public Integer getAllUserCount() {
        return this.userDao.countAll();
    }

}
