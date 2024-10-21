package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DingjianxinxiDao;
import com.entity.DingjianxinxiEntity;
import com.service.DingjianxinxiService;
import com.entity.vo.DingjianxinxiVO;
import com.entity.view.DingjianxinxiView;

@Service("dingjianxinxiService")
public class DingjianxinxiServiceImpl extends ServiceImpl<DingjianxinxiDao, DingjianxinxiEntity> implements DingjianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingjianxinxiEntity> page = this.selectPage(
                new Query<DingjianxinxiEntity>(params).getPage(),
                new EntityWrapper<DingjianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingjianxinxiEntity> wrapper) {
		  Page<DingjianxinxiView> page =new Query<DingjianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingjianxinxiVO> selectListVO(Wrapper<DingjianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingjianxinxiVO selectVO(Wrapper<DingjianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingjianxinxiView> selectListView(Wrapper<DingjianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingjianxinxiView selectView(Wrapper<DingjianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
