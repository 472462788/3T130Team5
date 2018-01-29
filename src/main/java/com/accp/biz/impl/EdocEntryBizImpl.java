package com.accp.biz.impl;

import com.accp.biz.EdocEntryBiz;
import com.accp.dao.EdocEntryDao;
import com.accp.entity.EdocEntry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EdocEntryBizImpl implements EdocEntryBiz {
    @Resource
    private EdocEntryDao edocEntryDao;

    public List<EdocEntry> selectEdocEntryList() {
        return edocEntryDao.selectEdocEntryList();
    }
}
