package com.accp.biz.impl;

import com.accp.biz.EdocCategoryBiz;
import com.accp.dao.EdocCategoryDao;
import com.accp.entity.EdocCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EdocCategoryBizImpl implements EdocCategoryBiz {
    @Resource
    private EdocCategoryDao edocCategoryDao;

    public List<EdocCategory> selectEdocCategoryList() {
        return edocCategoryDao.selectEdocCategoryList();
    }
}
