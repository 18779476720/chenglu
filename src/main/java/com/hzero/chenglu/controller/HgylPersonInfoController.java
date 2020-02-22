package com.hzero.chenglu.controller;

import com.hzero.chenglu.entity.HgylPersonInfo;
import com.hzero.chenglu.service.HgylPersonInfoService;
import com.hzero.chenglu.unit.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * hgyl_person_info
 * @author CHENG-LU 2020-02-22
 */
@RestController
@RequestMapping("/hzero")
public class HgylPersonInfoController {

    @Autowired
    private HgylPersonInfoService hgylPersonInfoService;

    /**
     * 新增
     */
    @RequestMapping("/insert")
    public ReturnT<String> insert(HgylPersonInfo hgylPersonInfo){
        return hgylPersonInfoService.insert(hgylPersonInfo);
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ReturnT<String> delete(int id){
        return hgylPersonInfoService.delete(id);
    }

    /**
     * 更新
     */
    @RequestMapping("/update")
    public ReturnT<String> update(HgylPersonInfo hgylPersonInfo){
        return hgylPersonInfoService.update(hgylPersonInfo);
    }

    /**
     * Load查询
     */

    @RequestMapping(value = "/load")
    public HgylPersonInfo load(int id){
        System.out.println("asdfadsf");
        return hgylPersonInfoService.load(id);
    }

    /**
     * 分页查询
     */
    @RequestMapping("/pageList")
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return hgylPersonInfoService.pageList(offset, pagesize);
    }

}
