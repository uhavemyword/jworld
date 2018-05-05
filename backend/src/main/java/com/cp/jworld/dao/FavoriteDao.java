package com.cp.jworld.dao;

import com.cp.jworld.model.Favorite;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavoriteDao extends EntityDao<Favorite> {
}
