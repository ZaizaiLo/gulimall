package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jin
 * @email jinliansheng@163.com
 * @date 2020-04-14 21:55:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
