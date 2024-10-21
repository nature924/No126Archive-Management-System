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


import com.dao.ShebeiweixiuDao;
import com.entity.ShebeiweixiuEntity;
import com.service.ShebeiweixiuService;
import com.entity.vo.ShebeiweixiuVO;
import com.entity.view.ShebeiweixiuView;

@Service("shebeiweixiuService")
public class ShebeiweixiuServiceImpl extends ServiceImpl<ShebeiweixiuDao, ShebeiweixiuEntity> implements ShebeiweixiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeiweixiuEntity> page = this.selectPage(
                new Query<ShebeiweixiuEntity>(params).getPage(),
                new EntityWrapper<ShebeiweixiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeiweixiuEntity> wrapper) {
		  Page<ShebeiweixiuView> page =new Query<ShebeiweixiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeiweixiuVO> selectListVO(Wrapper<ShebeiweixiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeiweixiuVO selectVO(Wrapper<ShebeiweixiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeiweixiuView> selectListView(Wrapper<ShebeiweixiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeiweixiuView selectView(Wrapper<ShebeiweixiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
