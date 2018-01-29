package com.accp.action;

import com.accp.biz.EdocEntryBiz;
import com.accp.entity.EdocEntry;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EdocEntryAction {
    @Resource
    private EdocEntryBiz edocEntryBiz;

    public List<EdocEntry> edocEntryList;

    public List<EdocEntry> getEdocEntryList() {
        return edocEntryList;
    }

    public void setEdocEntryList(List<EdocEntry> edocEntryList) {
        this.edocEntryList = edocEntryList;
    }

    public String EdocEntryList(){
        edocEntryList=edocEntryBiz.selectEdocEntryList();
        return "EdocEntryList";
    }
}
