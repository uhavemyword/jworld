package com.cp.jworld.service.impl;

import com.cp.jworld.dao.FavoriteDao;
import com.cp.jworld.model.Favorite;
import com.cp.jworld.service.FavoriteService;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServiceImpl extends EntityServiceImpl<Favorite, FavoriteDao> implements FavoriteService {
}
