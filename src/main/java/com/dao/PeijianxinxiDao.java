package com.dao;

import com.entity.PeijianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeijianxinxiVO;
import com.entity.view.PeijianxinxiView;


/**
 * 配件信息
 * 
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface PeijianxinxiDao extends BaseMapper<PeijianxinxiEntity> {
	
	List<PeijianxinxiVO> selectListVO(@Param("ew") Wrapper<PeijianxinxiEntity> wrapper);
	
	PeijianxinxiVO selectVO(@Param("ew") Wrapper<PeijianxinxiEntity> wrapper);
	
	List<PeijianxinxiView> selectListView(@Param("ew") Wrapper<PeijianxinxiEntity> wrapper);

	List<PeijianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PeijianxinxiEntity> wrapper);
	
	PeijianxinxiView selectView(@Param("ew") Wrapper<PeijianxinxiEntity> wrapper);
	

}
