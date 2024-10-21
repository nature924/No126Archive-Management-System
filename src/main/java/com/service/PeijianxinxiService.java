package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeijianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeijianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeijianxinxiView;


/**
 * 配件信息
 *
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public interface PeijianxinxiService extends IService<PeijianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeijianxinxiVO> selectListVO(Wrapper<PeijianxinxiEntity> wrapper);
   	
   	PeijianxinxiVO selectVO(@Param("ew") Wrapper<PeijianxinxiEntity> wrapper);
   	
   	List<PeijianxinxiView> selectListView(Wrapper<PeijianxinxiEntity> wrapper);
   	
   	PeijianxinxiView selectView(@Param("ew") Wrapper<PeijianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeijianxinxiEntity> wrapper);
   	

}

