package com.dao;

import com.entity.PeijiancaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeijiancaigouVO;
import com.entity.view.PeijiancaigouView;


/**
 * 配件采购
 * 
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface PeijiancaigouDao extends BaseMapper<PeijiancaigouEntity> {
	
	List<PeijiancaigouVO> selectListVO(@Param("ew") Wrapper<PeijiancaigouEntity> wrapper);
	
	PeijiancaigouVO selectVO(@Param("ew") Wrapper<PeijiancaigouEntity> wrapper);
	
	List<PeijiancaigouView> selectListView(@Param("ew") Wrapper<PeijiancaigouEntity> wrapper);

	List<PeijiancaigouView> selectListView(Pagination page,@Param("ew") Wrapper<PeijiancaigouEntity> wrapper);
	
	PeijiancaigouView selectView(@Param("ew") Wrapper<PeijiancaigouEntity> wrapper);
	

}
