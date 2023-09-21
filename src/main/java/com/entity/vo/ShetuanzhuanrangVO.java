package com.entity.vo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 社团转让
 * 数据库通用操作实体类（普通增删改查）
 * @author
 * @email
 * @date 2023-04-16 21:06:36
 */
public class ShetuanzhuanrangVO implements Serializable {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 学生账号
     */
    private String xueshengzhanghao;

    /**
     * 社团名称
     */
    private String shetuanmingcheng;

    /**
     * 社长账号
     */
    private String shezhangzhanghao;

    /**
     * 是否同意转让
     */
    private String sfty;

    /**
     * 转让备注
     */
    private String beizhu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXueshengzhanghao() {
        return xueshengzhanghao;
    }

    public void setXueshengzhanghao(String xueshengzhanghao) {
        this.xueshengzhanghao = xueshengzhanghao;
    }

    public String getShetuanmingcheng() {
        return shetuanmingcheng;
    }

    public void setShetuanmingcheng(String shetuanmingcheng) {
        this.shetuanmingcheng = shetuanmingcheng;
    }

    public String getShezhangzhanghao() {
        return shezhangzhanghao;
    }

    public void setShezhangzhanghao(String shezhangzhanghao) {
        this.shezhangzhanghao = shezhangzhanghao;
    }

    public String getSfty() {
        return sfty;
    }

    public void setSfty(String sfty) {
        this.sfty = sfty;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }



}
