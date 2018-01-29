package com.accp.dao.impl;

import com.accp.dao.EdocCategoryDao;
import com.accp.entity.EdocCategory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EdocCategoryDaoImpl extends HibernateDaoSupport implements EdocCategoryDao {
    public List<EdocCategory> selectEdocCategoryList() {
        return this.currentSession().createCriteria(EdocCategory.class).list();
    }
}
