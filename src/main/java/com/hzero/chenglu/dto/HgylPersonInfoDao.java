package com.hzero.chenglu.dto;

import com.hzero.chenglu.entity.HgylPersonInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * hgyl_person_info
 * @author CHENG-LU 2020-02-22
 */
@Mapper
@Component(value = "HgylPersonInfoDao")
public interface HgylPersonInfoDao {

    /**
     * 新增
     * @param hgylPersonInfo
     */
     int insert(HgylPersonInfo hgylPersonInfo);

    /**
     * 删除
     * @param id
     */
     Integer delete(@Param("id") Integer id);

    /**
     * 更新
     * @param
     */
     Integer update(HgylPersonInfo hgylPersonInfo);

    /**
     * 根据主键查询一个实体
     * @param id
     */
     HgylPersonInfo selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 分页查询Data
     * @param offset
     * @param pageSize
     */
     List<HgylPersonInfo> pageList(@Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    /**
     * 分页查询Count
     * @param offset
     * @param pagesize
     */
     Integer pageListCount(int offset, int pagesize);

     HgylPersonInfo load(int id);
}