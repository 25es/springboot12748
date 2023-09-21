package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.vo.ShetuanxinxiAddActivityItemVO;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 社团信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 21:06:36
 */
@TableName("shetuanxinxi")
public class ShetuanxinxiAddActivityItemVOView extends ShetuanxinxiAddActivityItemVO implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanxinxiAddActivityItemVOView(){
	}

 	public ShetuanxinxiAddActivityItemVOView(ShetuanxinxiAddActivityItemVO shetuanxinxiAddActivityItemVO){
 	try {
			BeanUtils.copyProperties(this, shetuanxinxiAddActivityItemVO);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
