package com.cp.jworld.dao;

import com.cp.jworld.model.Contact;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactDao extends EntityDao<Contact> {
    void deleteByUserId(Integer id);
}
