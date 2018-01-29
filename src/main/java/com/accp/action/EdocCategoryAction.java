package com.accp.action;

import com.accp.biz.EdocCategoryBiz;
import com.accp.entity.EdocCategory;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class EdocCategoryAction {
    @Resource
    private EdocCategoryBiz edocCategoryBiz;

    public List<EdocCategory> edocCategoryList;

    public List<EdocCategory> getEdocCategoryList() {
        return edocCategoryList;
    }

    public void setEdocCategoryList(List<EdocCategory> edocCategoryList) {
        this.edocCategoryList = edocCategoryList;
    }

    public String EdocCategoryList(){
        edocCategoryList=edocCategoryBiz.selectEdocCategoryList();
        return "";
    }
}
