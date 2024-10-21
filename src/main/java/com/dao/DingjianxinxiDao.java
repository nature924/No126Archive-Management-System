package com.dao;

import com.entity.DingjianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingjianxinxiVO;
import com.entity.view.DingjianxinxiView;


/**
 * 定检信息
 * 
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface DingjianxinxiDao extends BaseMapper<DingjianxinxiEntity> {
	
	List<DingjianxinxiVO> selectListVO(@Param("ew") Wrapper<DingjianxinxiEntity> wrapper);
	
	DingjianxinxiVO selectVO(@Param("ew") Wrapper<DingjianxinxiEntity> wrapper);
	
	List<DingjianxinxiView> selectListView(@Param("ew") Wrapper<DingjianxinxiEntity> wrapper);

	List<DingjianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DingjianxinxiEntity> wrapper);
	
	DingjianxinxiView selectView(@Param("ew") Wrapper<DingjianxinxiEntity> wrapper);
	

}
