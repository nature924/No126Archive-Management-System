package com.dao;

import com.entity.ShebeibaoyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeibaoyangVO;
import com.entity.view.ShebeibaoyangView;


/**
 * 设备保养
 * 
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface ShebeibaoyangDao extends BaseMapper<ShebeibaoyangEntity> {
	
	List<ShebeibaoyangVO> selectListVO(@Param("ew") Wrapper<ShebeibaoyangEntity> wrapper);
	
	ShebeibaoyangVO selectVO(@Param("ew") Wrapper<ShebeibaoyangEntity> wrapper);
	
	List<ShebeibaoyangView> selectListView(@Param("ew") Wrapper<ShebeibaoyangEntity> wrapper);

	List<ShebeibaoyangView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeibaoyangEntity> wrapper);
	
	ShebeibaoyangView selectView(@Param("ew") Wrapper<ShebeibaoyangEntity> wrapper);
	

}
