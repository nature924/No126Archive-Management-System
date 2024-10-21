package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeibaoyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeibaoyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeibaoyangView;


/**
 * 设备保养
 *
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface ShebeibaoyangService extends IService<ShebeibaoyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeibaoyangVO> selectListVO(Wrapper<ShebeibaoyangEntity> wrapper);
   	
   	ShebeibaoyangVO selectVO(@Param("ew") Wrapper<ShebeibaoyangEntity> wrapper);
   	
   	List<ShebeibaoyangView> selectListView(Wrapper<ShebeibaoyangEntity> wrapper);
   	
   	ShebeibaoyangView selectView(@Param("ew") Wrapper<ShebeibaoyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeibaoyangEntity> wrapper);
   	

}

