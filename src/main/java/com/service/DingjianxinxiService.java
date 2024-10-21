package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingjianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingjianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingjianxinxiView;


/**
 * 定检信息
 *
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface DingjianxinxiService extends IService<DingjianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingjianxinxiVO> selectListVO(Wrapper<DingjianxinxiEntity> wrapper);
   	
   	DingjianxinxiVO selectVO(@Param("ew") Wrapper<DingjianxinxiEntity> wrapper);
   	
   	List<DingjianxinxiView> selectListView(Wrapper<DingjianxinxiEntity> wrapper);
   	
   	DingjianxinxiView selectView(@Param("ew") Wrapper<DingjianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingjianxinxiEntity> wrapper);
   	

}

