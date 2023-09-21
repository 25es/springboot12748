package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.ShetuanxinxiVODao;
import com.entity.view.ShetuanxinxiAddActivityItemVOView;
import com.entity.vo.ShetuanxinxiAddActivityItemVO;
import com.service.ShetuanxinxiAddActivityService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("shetuanxinxiAddActivityService")
public class ShetuanxinxiAddActivityServiceImpl extends ServiceImpl<ShetuanxinxiVODao, ShetuanxinxiAddActivityItemVO> implements ShetuanxinxiAddActivityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanxinxiAddActivityItemVO> page = this.selectPage(
                new Query<ShetuanxinxiAddActivityItemVO>(params).getPage(),
                new EntityWrapper<ShetuanxinxiAddActivityItemVO>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanxinxiAddActivityItemVO> wrapper) {
        Page<ShetuanxinxiAddActivityItemVOView> page =new Query<ShetuanxinxiAddActivityItemVOView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,wrapper));
        PageUtils pageUtil = new PageUtils(page);
        return pageUtil;
    }

    @Override
    public List<ShetuanxinxiAddActivityItemVO> selectListVO(Wrapper<ShetuanxinxiAddActivityItemVO> wrapper) {
        return baseMapper.selectListVO(wrapper);
    }

    @Override
    public ShetuanxinxiAddActivityItemVO selectVO(Wrapper<ShetuanxinxiAddActivityItemVO> wrapper) {
        return baseMapper.selectVO(wrapper);
    }

    @Override
    public List<ShetuanxinxiAddActivityItemVOView> selectListView(Wrapper<ShetuanxinxiAddActivityItemVO> wrapper) {
        return baseMapper.selectListView(wrapper);
    }

    @Override
    public ShetuanxinxiAddActivityItemVOView selectView(Wrapper<ShetuanxinxiAddActivityItemVO> wrapper) {
        return baseMapper.selectView(wrapper);
    }


}
