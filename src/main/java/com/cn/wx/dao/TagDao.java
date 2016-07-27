package com.cn.wx.dao;

import com.cn.wx.model.Tag;

import java.util.List;
import java.util.Map;

/**
 * Created by heli on 2015/3/31.
 */
public interface TagDao {
    public Integer removeResTagRelation(String resId);
    public Integer addResTagRelation(List<Map<String, Object>> tagInfoList);
    public List<Tag> queryResTagRelation(String resId);
}
