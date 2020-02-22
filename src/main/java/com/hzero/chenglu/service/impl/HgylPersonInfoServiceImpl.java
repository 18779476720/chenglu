package com.hzero.chenglu.service.impl;

import com.hzero.chenglu.dto.HgylPersonInfoDao;
import com.hzero.chenglu.entity.HgylPersonInfo;
import com.hzero.chenglu.service.HgylPersonInfoService;
import com.hzero.chenglu.unit.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
@Service
public class HgylPersonInfoServiceImpl implements HgylPersonInfoService {

    @Resource
    private HgylPersonInfoDao hgylPersonInfoDao;

    /**
     * 新增
     */
    @Override
    public ReturnT<String> insert(HgylPersonInfo hgylPersonInfo) {

        // valid
        if (hgylPersonInfo == null) {
            return new ReturnT<String>();
        }

        hgylPersonInfoDao.insert(hgylPersonInfo);
        return ReturnT.buildSuccess;
    }

    /**
     * 删除
     */
    @Override
    public ReturnT<String> delete(int id) {
        int ret = hgylPersonInfoDao.delete(id);
        return ret > 0 ? ReturnT.buildSuccess : ReturnT.build("11111","删除失败");
    }

    /**
     * 更新
     */
    @Override
    public ReturnT<String> update(HgylPersonInfo hgylPersonInfo) {
        int ret = hgylPersonInfoDao.update(hgylPersonInfo);
        return (ret <= 0) ? ReturnT.build("11111","更新失败") : ReturnT.buildSuccess;
    }

    /**
     * Load查询
     */
    @Override
    public HgylPersonInfo load(int id) {
        System.out.println("service:"+id);
        return hgylPersonInfoDao.load(id);
    }

    /**
     * 分页查询
     */
    @Override
    public Map<String, Object> pageList(int offset, int pagesize) {

        List<HgylPersonInfo> pageList = hgylPersonInfoDao.pageList(offset, pagesize);
        int totalCount = hgylPersonInfoDao.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();

        return result;
    }
}