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


import com.dao.PeijiancaigouDao;
import com.entity.PeijiancaigouEntity;
import com.service.PeijiancaigouService;
import com.entity.vo.PeijiancaigouVO;
import com.entity.view.PeijiancaigouView;

@Service("peijiancaigouService")
public class PeijiancaigouServiceImpl extends ServiceImpl<PeijiancaigouDao, PeijiancaigouEntity> implements PeijiancaigouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeijiancaigouEntity> page = this.selectPage(
                new Query<PeijiancaigouEntity>(params).getPage(),
                new EntityWrapper<PeijiancaigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeijiancaigouEntity> wrapper) {
		  Page<PeijiancaigouView> page =new Query<PeijiancaigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeijiancaigouVO> selectListVO(Wrapper<PeijiancaigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeijiancaigouVO selectVO(Wrapper<PeijiancaigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeijiancaigouView> selectListView(Wrapper<PeijiancaigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeijiancaigouView selectView(Wrapper<PeijiancaigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
