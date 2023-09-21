package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ShetuanzhuanrangEntity;
import com.entity.ShetuanzhuanrangEntity;
import com.entity.view.ShetuanzhuanrangView;
import com.entity.vo.ShetuanzhuanrangVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 社团转让
 *
 * @author
 * @email
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanzhuanrangDao extends BaseMapper<ShetuanzhuanrangEntity> {
    List<ShetuanzhuanrangVO> selectListVO(@Param("ew") Wrapper<ShetuanzhuanrangEntity> wrapper);

    ShetuanzhuanrangVO selectVO(@Param("ew") Wrapper<ShetuanzhuanrangEntity> wrapper);

    List<ShetuanzhuanrangView> selectListView(@Param("ew") Wrapper<ShetuanzhuanrangEntity> wrapper);

    List<ShetuanzhuanrangView> selectListView(Pagination page, @Param("ew") Wrapper<ShetuanzhuanrangEntity> wrapper);

    ShetuanzhuanrangView selectView(@Param("ew") Wrapper<ShetuanzhuanrangEntity> wrapper);
}
