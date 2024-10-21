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


import com.dao.ShebeibaoyangDao;
import com.entity.ShebeibaoyangEntity;
import com.service.ShebeibaoyangService;
import com.entity.vo.ShebeibaoyangVO;
import com.entity.view.ShebeibaoyangView;

@Service("shebeibaoyangService")
public class ShebeibaoyangServiceImpl extends ServiceImpl<ShebeibaoyangDao, ShebeibaoyangEntity> implements ShebeibaoyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeibaoyangEntity> page = this.selectPage(
                new Query<ShebeibaoyangEntity>(params).getPage(),
                new EntityWrapper<ShebeibaoyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeibaoyangEntity> wrapper) {
		  Page<ShebeibaoyangView> page =new Query<ShebeibaoyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeibaoyangVO> selectListVO(Wrapper<ShebeibaoyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeibaoyangVO selectVO(Wrapper<ShebeibaoyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeibaoyangView> selectListView(Wrapper<ShebeibaoyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeibaoyangView selectView(Wrapper<ShebeibaoyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
