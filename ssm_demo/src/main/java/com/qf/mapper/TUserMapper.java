package com.qf.mapper;

import com.qf.entity.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

//解决无法注入的问题
@Mapper
@Component
public interface TUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}