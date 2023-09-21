package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ShetuanxinxiEntity;
import com.entity.ShetuanzhuanrangEntity;
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
public class ShetuanzhuanrangView extends ShetuanzhuanrangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanzhuanrangView(){
	}

 	public ShetuanzhuanrangView(ShetuanzhuanrangEntity shetuanzhuanrangEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanzhuanrangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
