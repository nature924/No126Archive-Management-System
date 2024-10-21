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


import com.dao.PeijianxinxiDao;
import com.entity.PeijianxinxiEntity;
import com.service.PeijianxinxiService;
import com.entity.vo.PeijianxinxiVO;
import com.entity.view.PeijianxinxiView;

@Service("peijianxinxiService")
public class PeijianxinxiServiceImpl extends ServiceImpl<PeijianxinxiDao, PeijianxinxiEntity> implements PeijianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeijianxinxiEntity> page = this.selectPage(
                new Query<PeijianxinxiEntity>(params).getPage(),
                new EntityWrapper<PeijianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeijianxinxiEntity> wrapper) {
		  Page<PeijianxinxiView> page =new Query<PeijianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeijianxinxiVO> selectListVO(Wrapper<PeijianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeijianxinxiVO selectVO(Wrapper<PeijianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeijianxinxiView> selectListView(Wrapper<PeijianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeijianxinxiView selectView(Wrapper<PeijianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
