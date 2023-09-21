package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.ShetuanxinxiEntity;
import com.entity.ShetuanzhuanrangEntity;
import com.entity.ShezhangEntity;
import com.entity.XueshengEntity;
import com.service.ShetuanxinxiService;
import com.service.ShetuanzhuanrangService;
import com.service.ShezhangService;
import com.service.XueshengService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 社团信息
 * 后端接口
 * @author
 * @email
 * @date 2021-04-16 21:06:36
 */
@RestController
@RequestMapping("/shetuanzhuanrang")
public class ShetuanzhuanrangController {
    @Autowired
    private ShetuanzhuanrangService shetuanzhuanrangService;
    @Autowired
    private ShezhangService shezhangService;
    @Autowired
    private XueshengService xueshengService;
    @Autowired
    private ShetuanxinxiService shetuanxinxiService;


    /**
     * 社长转让申请表
     */
    @RequestMapping("/transfer")
    public R transfer(@RequestBody String xuehao,HttpServletRequest request){
        Long id = (Long)request.getSession().getAttribute("userId");

        //查社长账号
        ShezhangEntity shezhang = shezhangService.selectById(id);
        String shezhangzhanghao = shezhang.getZhanghao();
        //查社长对应的社团名称
        ShetuanxinxiEntity shetuanxinxi = shetuanxinxiService.selectOne(new EntityWrapper<ShetuanxinxiEntity>().eq("zhanghao",shezhangzhanghao));
        String shetuanmingcheng = shetuanxinxi.getShetuanmingcheng();

        ShetuanzhuanrangEntity shetuanzhuanrangEntity = new ShetuanzhuanrangEntity();
        shetuanzhuanrangEntity.setXueshengzhanghao(xuehao);
        shetuanzhuanrangEntity.setShezhangzhanghao(shezhangzhanghao);
        shetuanzhuanrangEntity.setShetuanmingcheng(shetuanmingcheng);
        String sfty = "待确认";
        shetuanzhuanrangEntity.setSfty(sfty);
        shetuanzhuanrangService.insert(shetuanzhuanrangEntity);
        return R.ok();
    }

    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, ShetuanzhuanrangEntity shetuanzhuanrang,
                  HttpServletRequest request){
        EntityWrapper<ShetuanxinxiEntity> ew = new EntityWrapper<ShetuanxinxiEntity>();
        PageUtils page = shetuanzhuanrangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shetuanzhuanrang), params), params));

        return R.ok().put("data", page);
    }

    @RequestMapping("/shezhangzhanghao")
    public R Shezhangzhanghao(@RequestParam Map<String, Object> params,ShezhangEntity shezhang){
        EntityWrapper<ShezhangEntity> ew = new EntityWrapper<ShezhangEntity>();
        PageUtils page = shezhangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shezhang), params), params));
        return R.ok().put("data", page);
    }

    @RequestMapping("/xueshengzhanghao")
    public R Xueshengzhanghao(@RequestParam Map<String, Object> params, XueshengEntity xuesheng){
        EntityWrapper<XueshengEntity> ew = new EntityWrapper<XueshengEntity>();
        PageUtils page = xueshengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuesheng), params), params));
        return R.ok().put("data", page);
    }

    @RequestMapping("/update")
    public R Update(@RequestBody Map<String, Object> params){

        //交换学生和社长的信息
        ShezhangEntity shezhang = shezhangService.selectOne(
                new EntityWrapper<ShezhangEntity>().eq("id",params.get("shezhangId")));
        shezhang.setZhanghao((String) params.get("xuehao"));
        shezhang.setXingbie((String) params.get("xueshengXingbie"));
        shezhang.setXingming((String) params.get("xueshengxingming"));
        shezhang.setLianxidianhua((String) params.get("xueshengShouJi"));
        XueshengEntity xuesheng = xueshengService.selectOne(
                new EntityWrapper<XueshengEntity>().eq("id",params.get("id")));
        xuesheng.setXuehao((String) params.get("zhanghao"));
        xuesheng.setXingbie((String) params.get("shezhangXingbie"));
        xuesheng.setXueshengxingming((String) params.get("xingming"));
        xuesheng.setShouji((String) params.get("shezhangShouJi"));
        shezhangService.updateById(shezhang);
        xueshengService.updateById(xuesheng);


        ShetuanxinxiEntity shetuanxinxi = shetuanxinxiService.selectOne(
                new EntityWrapper<ShetuanxinxiEntity>().eq("shetuanmingcheng",params.get("shetuanmingcheng")));
        shetuanxinxi.setZhanghao((String) params.get("xuehao"));
        shetuanxinxiService.updateById(shetuanxinxi);

        ShetuanzhuanrangEntity shetuanzhuanrang = shetuanzhuanrangService.selectOne(
                new EntityWrapper<ShetuanzhuanrangEntity>().eq("id", params.get("rowId")));
        shetuanzhuanrang.setSfty("已通过");
        if(params.get("shenpibeizhu") != ""){
            shetuanzhuanrang.setBeizhu(((String) params.get("shenpibeizhu")).substring(3,((String) params.get("shenpibeizhu")).length()-4));
        }
        shetuanzhuanrangService.updateById(shetuanzhuanrang);
        return R.ok();
    }
}
