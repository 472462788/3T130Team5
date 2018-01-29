package com.accp.dao.impl;

import com.accp.dao.EdocEntryDao;
import com.accp.entity.EdocEntry;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EdocEntryDaoImpl extends HibernateDaoSupport implements EdocEntryDao {
    public List<EdocEntry> selectEdocEntryList() {
        return this.currentSession().createCriteria(EdocEntry.class).list();
    }
}
