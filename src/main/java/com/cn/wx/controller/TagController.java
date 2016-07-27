package com.cn.wx.controller;

import com.cn.wx.model.Tag;
import com.cn.wx.service.TagService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by kevin on 2015/11/13.
 */
@Controller
public class TagController {

    @Resource
    private TagService tagService;

    @RequestMapping(value="/getTag",method = RequestMethod.GET)
    public String getTag(Model model){
        Tag tag = tagService.queryResTagRelation("61f6c0d47a6542468b9d7f9ac5afcf66").get(0);
        model.addAttribute("tag",tag);
        return "tag";
    }

}
