package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeixinghaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeixinghaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeixinghaoView;


/**
 * 设备型号
 *
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface ShebeixinghaoService extends IService<ShebeixinghaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeixinghaoVO> selectListVO(Wrapper<ShebeixinghaoEntity> wrapper);
   	
   	ShebeixinghaoVO selectVO(@Param("ew") Wrapper<ShebeixinghaoEntity> wrapper);
   	
   	List<ShebeixinghaoView> selectListView(Wrapper<ShebeixinghaoEntity> wrapper);
   	
   	ShebeixinghaoView selectView(@Param("ew") Wrapper<ShebeixinghaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeixinghaoEntity> wrapper);
   	

}

