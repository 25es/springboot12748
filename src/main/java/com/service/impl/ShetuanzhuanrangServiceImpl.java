package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.ShetuanzhuanrangDao;
import com.entity.ShetuanzhuanrangEntity;
import com.entity.view.ShetuanzhuanrangView;
import com.entity.vo.ShetuanzhuanrangVO;
import com.service.ShetuanzhuanrangService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

import java.util.List;
import java.util.Map;

@Service("shetuanzhuanrangService")
public class ShetuanzhuanrangServiceImpl extends ServiceImpl<ShetuanzhuanrangDao, ShetuanzhuanrangEntity> implements ShetuanzhuanrangService {
    
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanzhuanrangEntity> page = this.selectPage(
                new Query<ShetuanzhuanrangEntity>(params).getPage(),
                new EntityWrapper<ShetuanzhuanrangEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanzhuanrangEntity> wrapper) {
        Page<ShetuanzhuanrangView> page =new Query<ShetuanzhuanrangView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,wrapper));
        PageUtils pageUtil = new PageUtils(page);
        return pageUtil;
    }

    @Override
    public List<ShetuanzhuanrangVO> selectListVO(Wrapper<ShetuanzhuanrangEntity> wrapper) {
        return baseMapper.selectListVO(wrapper);
    }

    @Override
    public ShetuanzhuanrangVO selectVO(Wrapper<ShetuanzhuanrangEntity> wrapper) {
        return baseMapper.selectVO(wrapper);
    }

    @Override
    public List<ShetuanzhuanrangView> selectListView(Wrapper<ShetuanzhuanrangEntity> wrapper) {
        return baseMapper.selectListView(wrapper);
    }

    @Override
    public ShetuanzhuanrangView selectView(Wrapper<ShetuanzhuanrangEntity> wrapper) {
        return baseMapper.selectView(wrapper);
    }
}
