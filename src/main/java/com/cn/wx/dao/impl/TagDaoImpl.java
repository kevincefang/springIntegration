package com.cn.wx.dao.impl;

import com.cn.wx.dao.TagDao;
import com.cn.wx.model.Tag;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by kevin on 2015/11/13.
 */
public class TagDaoImpl implements TagDao{

    private SqlSessionFactory sqlSessionFactory;

    public Integer removeResTagRelation(String resId) {
        return null;
    }

    public Integer addResTagRelation(List<Map<String, Object>> tagInfoList) {
        return null;
    }

    public List<Tag> queryResTagRelation(String resId) {
        SqlSession session = sqlSessionFactory.openSession();
        List<Tag> tagList = session.selectList("Tag.queryResTagRelation",resId);
        session.close();
        return tagList;
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
