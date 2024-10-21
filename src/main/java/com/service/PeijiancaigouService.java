package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeijiancaigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeijiancaigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeijiancaigouView;


/**
 * 配件采购
 *
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface PeijiancaigouService extends IService<PeijiancaigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeijiancaigouVO> selectListVO(Wrapper<PeijiancaigouEntity> wrapper);
   	
   	PeijiancaigouVO selectVO(@Param("ew") Wrapper<PeijiancaigouEntity> wrapper);
   	
   	List<PeijiancaigouView> selectListView(Wrapper<PeijiancaigouEntity> wrapper);
   	
   	PeijiancaigouView selectView(@Param("ew") Wrapper<PeijiancaigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeijiancaigouEntity> wrapper);
   	

}

