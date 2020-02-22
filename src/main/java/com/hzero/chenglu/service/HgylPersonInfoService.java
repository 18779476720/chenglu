package com.hzero.chenglu.service;

import com.hzero.chenglu.entity.HgylPersonInfo;
import com.hzero.chenglu.unit.ReturnT;

import java.util.Map;

public interface HgylPersonInfoService {
    /**
     * 新增
     */
    public ReturnT<String> insert(HgylPersonInfo hgylPersonInfo);

    /**
     * 删除
     */
    public ReturnT<String> delete(int id);

    /**
     * 更新
     */
    public ReturnT<String> update(HgylPersonInfo hgylPersonInfo);

    /**
     * Load查询
     */
    public HgylPersonInfo load(int id);

    /**
     * 分页查询
     */
    public Map<String,Object> pageList(int offset, int pagesize);
}
