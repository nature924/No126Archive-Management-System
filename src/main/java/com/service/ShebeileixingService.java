package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeileixingView;


/**
 * 设备类型
 *
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface ShebeileixingService extends IService<ShebeileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeileixingVO> selectListVO(Wrapper<ShebeileixingEntity> wrapper);
   	
   	ShebeileixingVO selectVO(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
   	
   	List<ShebeileixingView> selectListView(Wrapper<ShebeileixingEntity> wrapper);
   	
   	ShebeileixingView selectView(@Param("ew") Wrapper<ShebeileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeileixingEntity> wrapper);
   	

}

