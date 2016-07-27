package com.cn.wx.service.impl;

import com.cn.wx.dao.TagDao;
import com.cn.wx.model.Tag;
import com.cn.wx.service.TagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kevin on 2015/11/13.
 */
@Service("tagService")
public class TagServiceImpl implements TagService{

    private TagDao tagDao;

    public List<Tag> queryResTagRelation(String resId) {
        List<Tag> list = tagDao.queryResTagRelation(resId);
        return list;
    }

    public TagDao getTagDao() {
        return tagDao;
    }

    public void setTagDao(TagDao tagDao) {
        this.tagDao = tagDao;
    }
}
