const menu = {
    list() {
        // return [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社长","menuJump":"列表","tableName":"shezhang"}],"menu":"社长管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团类型","menuJump":"列表","tableName":"shetuanleixing"}],"menu":"社团类型管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"社团信息","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团申请","menuJump":"列表","tableName":"shetuanshenqing"}],"menu":"社团申请管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"社团活动","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看","删除"],"menu":"留言板管理","tableName":"forum"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团资讯","tableName":"news"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看","报名"],"menu":"社团活动列表","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"社团申请","menuJump":"列表","tableName":"shetuanshenqing"}],"menu":"社团申请管理"},{"child":[{"buttons":["查看","删除"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看","报名"],"menu":"社团活动列表","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"社团信息","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"社团申请","menuJump":"列表","tableName":"shetuanshenqing"}],"menu":"社团申请管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"社团活动","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"活动报名","menuJump":"列表","tableName":"huodongbaoming"}],"menu":"活动报名管理"}],"frontMenu":[{"child":[{"buttons":["查看","加入"],"menu":"社团信息列表","menuJump":"列表","tableName":"shetuanxinxi"}],"menu":"社团信息模块"},{"child":[{"buttons":["查看","报名"],"menu":"社团活动列表","menuJump":"列表","tableName":"shetuanhuodong"}],"menu":"社团活动模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"社长","tableName":"shezhang"}]
        return [{
            "backMenu": [{
                "child": [{
                    "buttons": ["查看", "修改", "删除", "转让"],
                    "menu": "学生信息",
                    "menuJump": "列表",
                    "tableName": "xuesheng"
                }],
                "menu": "学生信息管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "社长信息",
                    "menuJump": "列表",
                    "tableName": "shezhang"
                }],
                "menu": "社长信息管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "社团分类",
                    "menuJump": "列表",
                    "tableName": "shetuanleixing"
                }],
                "menu": "社团分类管理"
            }, {
                "child": [{
                    "buttons": ["查看"],
                    "menu": "社团星级统计",
                    "menuJump": "列表",
                    "tableName": "shetuanxingjitongji"
                }],
                "menu": "社团星级统计"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除", "查看评论"],
                    "menu": "社团信息",
                    "menuJump": "列表",
                    "tableName": "shetuanxinxi"
                }],
                "menu": "社团信息管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "入团申请",
                    "menuJump": "列表",
                    "tableName": "shetuanshenqing"
                }],
                "menu": "入团申请管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "社团活动",
                    "menuJump": "列表",
                    "tableName": "shetuanhuodong"
                }],
                "menu": "社团活动管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "活动报名",
                    "menuJump": "列表",
                    "tableName": "huodongbaoming"
                }],
                "menu": "活动报名管理"
            }, {
                "child": [{
                    "buttons": ["查看", "删除"],
                    "menu": "留言板管理",
                    "tableName": "forum"
                }],
                "menu": "留言板管理"
            }, {
                "child": [{
                    "buttons": ["审批"],
                    "menu": "社长转让",
                    "menuJump": "列表",
                    "tableName": "shetuanzhuanrang"
                }],
                "menu": "社长转让管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "社团公告",
                    "tableName": "news"
                }, {
                    "buttons": ["查看", "修改"],
                    "menu": "轮播图管理",
                    "tableName": "config"
                }],
                "menu": "系统管理"
            }],
            "frontMenu": [{
                "child": [{
                    "buttons": ["查看", "加入"],
                    "menu": "社团信息列表",
                    "menuJump": "列表",
                    "tableName": "shetuanxinxi"
                }],
                "menu": "社团信息模块"
            }, {
                "child": [{
                    "buttons": ["查看", "报名"],
                    "menu": "社团活动列表",
                    "menuJump": "列表",
                    "tableName": "shetuanhuodong"
                }],
                "menu": "社团活动模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "buttons": ["查看", "删除"],
                    "menu": "社团申请",
                    "menuJump": "列表",
                    "tableName": "shetuanshenqing"
                }],
                "menu": "入团申请管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "留言板管理",
                    "menuJump": "列表",
                    "tableName": "forum"
                }],
                "menu": "留言板管理"
            }, {
                "child": [{
                    "buttons": ["查看", "删除"],
                    "menu": "活动报名",
                    "menuJump": "列表",
                    "tableName": "huodongbaoming"
                }],
                "menu": "活动报名管理"
            }, {
                "child": [{
                    "buttons": ["查看", "删除"],
                    "menu": "我的收藏管理",
                    "tableName": "storeup"
                }],
                "menu": "我的收藏管理"
            }],
            "frontMenu": [{
                "child": [{
                    "buttons": ["查看", "加入"],
                    "menu": "社团信息列表",
                    "menuJump": "列表",
                    "tableName": "shetuanxinxi"
                }],
                "menu": "社团信息模块"
            }, {
                "child": [{
                    "buttons": ["查看", "报名"],
                    "menu": "社团活动列表",
                    "menuJump": "列表",
                    "tableName": "shetuanhuodong"
                }],
                "menu": "社团活动模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "学生",
            "tableName": "xuesheng"
        }, {
            "backMenu": [{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除", "查看评论"],
                    "menu": "我的社团",
                    "menuJump": "列表",
                    "tableName": "shetuanxinxi"
                }],
                "menu": "我的社团"
            }, {
                "child": [{
                    "buttons": ["查看", "删除", "审核"],
                    "menu": "入团申请",
                    "menuJump": "列表",
                    "tableName": "shetuanshenqing"
                }],
                "menu": "入团申请管理"
            }, {
                "child": [{
                    "buttons": ["查看", "删除",],
                    "menu": "社团人员信息",
                    "menuJump": "列表",
                    "tableName": "shetuanrenyuanxinxi"
                }],
                "menu": "社团人员信息"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "社团活动",
                    "menuJump": "列表",
                    "tableName": "shetuanhuodong"
                }],
                "menu": "社团活动管理"
            }, {
                "child": [{
                    "buttons": ["查看", "删除", "审核"],
                    "menu": "活动报名",
                    "menuJump": "列表",
                    "tableName": "huodongbaoming"
                }],
                "menu": "活动报名管理"
            }],
            "frontMenu": [{
                "child": [{
                    "buttons": ["查看", "加入"],
                    "menu": "社团信息列表",
                    "menuJump": "列表",
                    "tableName": "shetuanxinxi"
                }],
                "menu": "社团信息模块"
            }, {
                "child": [{
                    "buttons": ["查看", "报名"],
                    "menu": "社团活动列表",
                    "menuJump": "列表",
                    "tableName": "shetuanhuodong"
                }],
                "menu": "社团活动模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "社长",
            "tableName": "shezhang"
        }]
    }
}
export default menu;
