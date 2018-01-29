package com.accp.dao;

import com.accp.entity.EdocEntry;

import java.util.List;

public interface EdocEntryDao {
    List<EdocEntry> selectEdocEntryList();
}
