package com.cn.wx.service;

import com.cn.wx.model.Tag;

import java.util.List;

/**
 * Created by kevin on 2015/11/13.
 */

public interface TagService {

    public List<Tag> queryResTagRelation(String resId);

}
