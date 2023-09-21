package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.view.ShetuanxinxiAddActivityItemVOView;
import com.entity.vo.ShetuanxinxiAddActivityItemVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 社团信息
 * 添加活动人数
 *
 * @author
 * @email
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanxinxiAddActivityService extends IService<ShetuanxinxiAddActivityItemVO> {

    PageUtils queryPage(Map<String, Object> params);

    List<ShetuanxinxiAddActivityItemVO> selectListVO(Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);

    ShetuanxinxiAddActivityItemVO selectVO(@Param("ew") Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);

    List<ShetuanxinxiAddActivityItemVOView> selectListView(Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);

    ShetuanxinxiAddActivityItemVOView selectView(@Param("ew") Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);

}