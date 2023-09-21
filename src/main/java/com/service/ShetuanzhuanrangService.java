package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.ShetuanzhuanrangEntity;
import com.entity.ShetuanzhuanrangEntity;
import com.entity.view.ShetuanzhuanrangView;
import com.entity.vo.ShetuanzhuanrangVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 社团转让
 *
 * @author
 * @email
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanzhuanrangService extends IService<ShetuanzhuanrangEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ShetuanzhuanrangVO> selectListVO(Wrapper<ShetuanzhuanrangEntity> wrapper);

    ShetuanzhuanrangVO selectVO(@Param("ew") Wrapper<ShetuanzhuanrangEntity> wrapper);

    List<ShetuanzhuanrangView> selectListView(Wrapper<ShetuanzhuanrangEntity> wrapper);

    ShetuanzhuanrangView selectView(@Param("ew") Wrapper<ShetuanzhuanrangEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanzhuanrangEntity> wrapper);

}
