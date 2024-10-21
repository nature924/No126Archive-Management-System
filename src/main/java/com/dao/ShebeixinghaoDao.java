package com.dao;

import com.entity.ShebeixinghaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeixinghaoVO;
import com.entity.view.ShebeixinghaoView;


/**
 * 设备型号
 * 
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface ShebeixinghaoDao extends BaseMapper<ShebeixinghaoEntity> {
	
	List<ShebeixinghaoVO> selectListVO(@Param("ew") Wrapper<ShebeixinghaoEntity> wrapper);
	
	ShebeixinghaoVO selectVO(@Param("ew") Wrapper<ShebeixinghaoEntity> wrapper);
	
	List<ShebeixinghaoView> selectListView(@Param("ew") Wrapper<ShebeixinghaoEntity> wrapper);

	List<ShebeixinghaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeixinghaoEntity> wrapper);
	
	ShebeixinghaoView selectView(@Param("ew") Wrapper<ShebeixinghaoEntity> wrapper);
	

}
