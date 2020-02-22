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
    public Integer insert(@Param("hgylPersonInfo") HgylPersonInfo hgylPersonInfo);

    /**
     * 删除
     * @param id
     */
    public Integer delete(@Param("id") Integer id);

    /**
     * 更新
     * @param
     */
    public Integer update(@Param("hgylPersonInfo") HgylPersonInfo hgylPersonInfo);

    /**
     * 根据主键查询一个实体
     * @param id
     */
    public HgylPersonInfo selectByPrimaryKey(@Param("id") Integer id);

    /**
     * 分页查询Data
     * @param offset
     * @param pageSize
     */
    public List<HgylPersonInfo> pageList(@Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    /**
     * 分页查询Count
     * @param offset
     * @param pagesize
     */
    public Integer pageListCount(int offset, int pagesize);

    public HgylPersonInfo load(int id);
}