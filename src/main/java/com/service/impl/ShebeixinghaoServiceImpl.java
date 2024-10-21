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


import com.dao.ShebeixinghaoDao;
import com.entity.ShebeixinghaoEntity;
import com.service.ShebeixinghaoService;
import com.entity.vo.ShebeixinghaoVO;
import com.entity.view.ShebeixinghaoView;

@Service("shebeixinghaoService")
public class ShebeixinghaoServiceImpl extends ServiceImpl<ShebeixinghaoDao, ShebeixinghaoEntity> implements ShebeixinghaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeixinghaoEntity> page = this.selectPage(
                new Query<ShebeixinghaoEntity>(params).getPage(),
                new EntityWrapper<ShebeixinghaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeixinghaoEntity> wrapper) {
		  Page<ShebeixinghaoView> page =new Query<ShebeixinghaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeixinghaoVO> selectListVO(Wrapper<ShebeixinghaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeixinghaoVO selectVO(Wrapper<ShebeixinghaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeixinghaoView> selectListView(Wrapper<ShebeixinghaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeixinghaoView selectView(Wrapper<ShebeixinghaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
