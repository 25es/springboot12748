package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.view.ShetuanxinxiAddActivityItemVOView;
import com.entity.vo.ShetuanxinxiAddActivityItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 社团信息
 * 
 * @author 
 * @email 
 * @date 2021-04-16 21:06:36
 */
public interface ShetuanxinxiVODao extends BaseMapper<ShetuanxinxiAddActivityItemVO> {
	
	List<ShetuanxinxiAddActivityItemVO> selectListVO(@Param("ew") Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);
	
	ShetuanxinxiAddActivityItemVO selectVO(@Param("ew") Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);
	
	List<ShetuanxinxiAddActivityItemVOView> selectListView(@Param("ew") Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);

	List<ShetuanxinxiAddActivityItemVOView> selectListView(Pagination page, @Param("ew") Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);

	ShetuanxinxiAddActivityItemVOView selectView(@Param("ew") Wrapper<ShetuanxinxiAddActivityItemVO> wrapper);
	
}
