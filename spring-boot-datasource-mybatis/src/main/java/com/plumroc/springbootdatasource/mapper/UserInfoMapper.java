package com.plumroc.springbootdatasource.mapper;

import com.plumroc.springbootdatasource.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 测试 数据源 1
 * <p>
 * 人员信息mapper接口
 *
 * @author PlumRoc
 * @date 2022-11-01
 */
@Mapper
public interface UserInfoMapper {


    /**
     * 新增接口
     *
     * @param userInfo 人员信息实体
     * @return 新增的行数
     * @author 程序员小强
     * @date 2020-07-25
     */
    int insert(UserInfo userInfo);

    /**
     * 查询所有 人员信息
     *
     * @return 人员信息 列表
     * @author 程序员小强
     * @date 2020-07-25
     */
    List<UserInfo> getAll();

    /**
     * 根据业务主键id查询
     *
     * @param userId 业务主键
     * @return 人员信息实体
     * @author 程序员小强
     * @date 2020-07-25
     */
    UserInfo getByUserId(String userId);

    /**
     * 根据业务主键编辑
     *
     * @param userInfo 人员信息实体
     * @return 编辑的行数
     * @author 程序员小强
     * @date 2020-07-25
     */
    int updateByUserId(UserInfo userInfo);

    /**
     * 根据业务主键动态参数编辑
     *
     * @param userInfo 人员信息实体
     * @return 编辑的行数
     * @author 程序员小强
     * @date 2020-07-25
     */
    int updateByUserIdSelective(UserInfo userInfo);


}
