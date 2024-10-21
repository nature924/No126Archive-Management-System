package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeiweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeiweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeiweixiuView;


/**
 * 设备维修
 *
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface ShebeiweixiuService extends IService<ShebeiweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeiweixiuVO> selectListVO(Wrapper<ShebeiweixiuEntity> wrapper);
   	
   	ShebeiweixiuVO selectVO(@Param("ew") Wrapper<ShebeiweixiuEntity> wrapper);
   	
   	List<ShebeiweixiuView> selectListView(Wrapper<ShebeiweixiuEntity> wrapper);
   	
   	ShebeiweixiuView selectView(@Param("ew") Wrapper<ShebeiweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeiweixiuEntity> wrapper);
   	

}

