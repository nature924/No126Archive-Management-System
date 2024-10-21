package com.dao;

import com.entity.HetongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HetongxinxiVO;
import com.entity.view.HetongxinxiView;


/**
 * 合同信息
 * 
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface HetongxinxiDao extends BaseMapper<HetongxinxiEntity> {
	
	List<HetongxinxiVO> selectListVO(@Param("ew") Wrapper<HetongxinxiEntity> wrapper);
	
	HetongxinxiVO selectVO(@Param("ew") Wrapper<HetongxinxiEntity> wrapper);
	
	List<HetongxinxiView> selectListView(@Param("ew") Wrapper<HetongxinxiEntity> wrapper);

	List<HetongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HetongxinxiEntity> wrapper);
	
	HetongxinxiView selectView(@Param("ew") Wrapper<HetongxinxiEntity> wrapper);
	

}
