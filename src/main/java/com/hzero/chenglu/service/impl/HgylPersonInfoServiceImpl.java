package com.hzero.chenglu.service.impl;

import com.hzero.chenglu.dto.HgylPersonInfoDao;
import com.hzero.chenglu.entity.HgylPersonInfo;
import com.hzero.chenglu.service.HgylPersonInfoService;
import com.hzero.chenglu.unit.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
@Service
public class HgylPersonInfoServiceImpl implements HgylPersonInfoService {
    @Autowired
    private HgylPersonInfoDao hgylPersonInfoDao;

    /**
     * 新增
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(HgylPersonInfo hgylPersonInfo) {

        // valid
        if (hgylPersonInfo == null) {
            return 0;
        }
        System.out.println("dao插入");


        return hgylPersonInfoDao.insert(hgylPersonInfo);
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
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(HgylPersonInfo hgylPersonInfo) {
        return  hgylPersonInfoDao.update(hgylPersonInfo);
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