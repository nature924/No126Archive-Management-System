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


import com.dao.ShebeileixingDao;
import com.entity.ShebeileixingEntity;
import com.service.ShebeileixingService;
import com.entity.vo.ShebeileixingVO;
import com.entity.view.ShebeileixingView;

@Service("shebeileixingService")
public class ShebeileixingServiceImpl extends ServiceImpl<ShebeileixingDao, ShebeileixingEntity> implements ShebeileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeileixingEntity> page = this.selectPage(
                new Query<ShebeileixingEntity>(params).getPage(),
                new EntityWrapper<ShebeileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeileixingEntity> wrapper) {
		  Page<ShebeileixingView> page =new Query<ShebeileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeileixingVO> selectListVO(Wrapper<ShebeileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeileixingVO selectVO(Wrapper<ShebeileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeileixingView> selectListView(Wrapper<ShebeileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeileixingView selectView(Wrapper<ShebeileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
