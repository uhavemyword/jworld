package com.cp.jworld.service.impl;

import com.cp.jworld.dao.ContactDao;
import com.cp.jworld.dao.UserDao;
import com.cp.jworld.model.Contact;
import com.cp.jworld.model.User;
import com.cp.jworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends EntityServiceImpl<User, UserDao> implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ContactDao contactDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(User user) {
        userDao.insert(user);
        Contact contact = new Contact();
        contact.setPhone("12341234");
        contact.setAddress("alskdl");
        contact.setUser(user);
        contactDao.insert(contact);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Integer id) {
        contactDao.deleteByUserId(id);
        userDao.deleteById(id);
    }
}
