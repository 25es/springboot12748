<template>
  <div class="addEdit-block">
    <el-form
        class="detail-form-content"
        ref="ruleForm"
        :model="ruleForm"
        :rules="rules"
        label-width="80px"
        :style="{backgroundColor:addEditForm.addEditBoxColor}">
      <el-row>
        <el-col :span="24">
          <el-form-item class="input" v-if="type!='else'" label="社团名称" label-width="120px" prop="shetuanmingcheng">
            <el-input v-model="ruleForm.shetuanmingcheng"
                      placeholder="社团名称" clearable :readonly="ro.shetuanmingcheng"></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="社团名称" label-width="120px" prop="shetuanmingcheng">
              <el-input v-model="ruleForm.shetuanmingcheng"
                        placeholder="社团名称" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>

        <el-col :span="12">
          <el-form-item class="input" v-if="type!='else'" label="原社长姓名" label-width="120px" prop="xingming">
            <el-input v-model="ruleForm.xingming"
                      placeholder="原社长姓名" clearable :readonly="ro.zhanghao"></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="原社长姓名" label-width="120px" prop="xingming">
              <el-input v-model="ruleForm.xingming"
                        placeholder="原社长姓名" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='else'" label="新社长姓名" label-width="120px"
                        prop="xueshengxingming">
            <el-input v-model="ruleForm.xueshengxingming"
                      placeholder="新社长姓名" clearable :readonly="ro.xingming"></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="新社长姓名" label-width="120px" prop="xueshengxingming">
              <el-input v-model="ruleForm.xueshengxingming"
                        placeholder="新社长姓名" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='else'" label="原社长联系电话" label-width="120px"
                        prop="lianxidianhua">
            <el-input v-model="ruleForm.lianxidianhua"
                      placeholder="原社长联系电话" clearable :readonly="ro.lianxidianhua"></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="原社长联系电话" label-width="120px" prop="lianxidianhua">
              <el-input v-model="ruleForm.lianxidianhua"
                        placeholder="原社长联系电话" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='else'" label="现社长联系电话" label-width="120px" prop="shouji">
            <el-input v-model="ruleForm.shouji"
                      placeholder="现社长联系电话" clearable :readonly="ro.youxiang"></el-input>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" label="现社长联系电话" label-width="120px" prop="shouji">
              <el-input v-model="ruleForm.shouji"
                        placeholder="现社长联系电话" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="24">
          <el-form-item class="input"  v-if="type!='into'"  label="审批备注" label-width="120px"  prop="shenpibeizhu">
            <editor
                style="min-width: 200px; max-width: 600px;"
                v-model="ruleForm.shenpibeizhu"
                class="editor"
                action="file/upload">
            </editor>
          </el-form-item>
          <div v-else>
            <el-form-item class="input" v-if="ruleForm.shetuanjianjie" label="审批备注" label-width="120px" prop="shenpibeizhu">
              <span v-html="ruleForm.shenpibeizhu"></span>
            </el-form-item>
          </div>
        </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">同意</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import {isNumber, isIntNumer, isEmail, isPhone, isMobile, isURL, checkIdCard} from "@/utils/validate";

export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if (!value) {
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
      addEditForm: {
        "btnSaveFontColor": "#fff",
        "selectFontSize": "14px",
        "btnCancelBorderColor": "#DCDFE6",
        "inputBorderRadius": "4px",
        "inputFontSize": "14px",
        "textareaBgColor": "#fff",
        "btnSaveFontSize": "14px",
        "textareaBorderRadius": "4px",
        "uploadBgColor": "#fff",
        "textareaBorderStyle": "solid",
        "btnCancelWidth": "88px",
        "textareaHeight": "120px",
        "dateBgColor": "#fff",
        "btnSaveBorderRadius": "4px",
        "uploadLableFontSize": "14px",
        "textareaBorderWidth": "1px",
        "inputLableColor": "#606266",
        "addEditBoxColor": "#fff",
        "dateIconFontSize": "14px",
        "btnSaveBgColor": "rgba(81, 163, 81, 1)",
        "uploadIconFontColor": "#8c939d",
        "textareaBorderColor": "#DCDFE6",
        "btnCancelBgColor": "#ecf5ff",
        "selectLableColor": "#606266",
        "btnSaveBorderStyle": "solid",
        "dateBorderWidth": "1px",
        "dateLableFontSize": "14px",
        "dateBorderRadius": "4px",
        "btnCancelBorderStyle": "solid",
        "selectLableFontSize": "14px",
        "selectBorderStyle": "solid",
        "selectIconFontColor": "#C0C4CC",
        "btnCancelHeight": "44px",
        "inputHeight": "40px",
        "btnCancelFontColor": "#606266",
        "dateBorderColor": "#DCDFE6",
        "dateIconFontColor": "#C0C4CC",
        "uploadBorderStyle": "solid",
        "dateBorderStyle": "solid",
        "dateLableColor": "#606266",
        "dateFontSize": "14px",
        "inputBorderWidth": "1px",
        "uploadIconFontSize": "28px",
        "selectHeight": "40px",
        "inputFontColor": "#606266",
        "uploadHeight": "148px",
        "textareaLableColor": "#606266",
        "textareaLableFontSize": "14px",
        "btnCancelFontSize": "14px",
        "inputBorderStyle": "solid",
        "btnCancelBorderRadius": "4px",
        "inputBgColor": "#fff",
        "inputLableFontSize": "14px",
        "uploadLableColor": "#606266",
        "uploadBorderRadius": "4px",
        "btnSaveHeight": "44px",
        "selectBgColor": "#fff",
        "btnSaveWidth": "88px",
        "selectIconFontSize": "14px",
        "dateHeight": "40px",
        "selectBorderColor": "#DCDFE6",
        "inputBorderColor": "#DCDFE6",
        "uploadBorderColor": "#DCDFE6",
        "textareaFontColor": "#606266",
        "selectBorderWidth": "1px",
        "dateFontColor": "#606266",
        "btnCancelBorderWidth": "1px",
        "uploadBorderWidth": "1px",
        "textareaFontSize": "14px",
        "selectBorderRadius": "4px",
        "selectFontColor": "#606266",
        "btnSaveBorderColor": "#409EFF",
        "btnSaveBorderWidth": "0px"
      },
      id: '',
      type: '',
      rowId: '',
      shetuanmingcheng: '',
      shezhangDataList: [],
      xueshengDataList: [],
      ro: {
        shetuanmingcheng: false,
        shetuanleixing: false,
        shetuantupian: false,
        chenglishijian: false,
        shetuanrenshu: false,
        zhanghao: false,
        xingming: false,
        lianxidianhua: false,
        youxiang: false,
        shetuanjianjie: false,
      },
      ruleForm: {
        shetuanmingcheng: '',
        shetuanleixing: '',
        shetuantupian: '',
        chenglishijian: '',
        shetuanrenshu: '',
        zhanghao: '',
        xingming: '',
        lianxidianhua: '',
        youxiang: '',
        shenpibeizhu: '',
        shouji: '',
        xueshengxingming: '',
        shezhangId: '',
        shezhangShouJi: '',
        shezhangMingCheng: '',
        shezhangXingbie: '',
        xuesheId: '',
        xuehao:'',
        xueshengShouJi: '',
        xueshengMingCheng: '',
        xueshengXingbie: '',
      },
      shetuanleixingOptions: [],
      rules: {
        shetuanmingcheng: [],
        shetuanleixing: [],
        shetuantupian: [],
        chenglishijian: [],
        shetuanrenshu: [
          {validator: validateIntNumber, trigger: 'blur'},
        ],
        zhanghao: [],
        xingming: [],
        lianxidianhua: [],
        youxiang: [],
        shetuanjianjie: [],
      }
    };
  },
  props: ["parent"],
  computed: {},
  created() {
    this.addEditStyleChange()
    this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file) {
      window.open(`${file}`)
    },
    // 初始化


    init(id, shezhangParams, xuehaoParams, shetuanmingcheng, type) {
      this.rowId = id
      this.$http({
        url: "shetuanzhuanrang/shezhangzhanghao",
        method: "get",
        params: shezhangParams
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.shezhangDataList = data.data.list;
          this.ruleForm.shezhangId = this.shezhangDataList[0]["id"]
          this.ruleForm.zhanghao = shezhangParams["zhanghao"]
          this.ruleForm.xingming = this.shezhangDataList[0]["xingming"]
          this.ruleForm.shezhangXingbie = this.shezhangDataList[0]["xingbie"]
          this.ruleForm.lianxidianhua = this.shezhangDataList[0]["lianxidianhua"]

        } else {
          this.shezhangDataList = [];
        }
      });

      this.$http({
        url: "shetuanzhuanrang/xueshengzhanghao",
        method: "get",
        params: xuehaoParams
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.xueshengDataList = data.data.list;
          this.ruleForm.xuesheId = this.xueshengDataList[0]["id"]
          this.ruleForm.xuehao = this.xueshengDataList[0]["xuehao"]
          this.ruleForm.xueshengxingming = this.xueshengDataList[0]["xueshengxingming"]
          this.ruleForm.xuesheXingbie = this.xueshengDataList[0]["xingbie"]
          this.ruleForm.shouji = this.xueshengDataList[0]["shouji"]
        } else {
          this.xueshengzhanghao = [];
        }
      })

      if (id) {
        this.id = id;
        this.type = type;
        this.ruleForm.shetuanmingcheng = shetuanmingcheng;
      }
      if (this.type == 'info' || this.type == 'else') {
        this.info(id);
      } else if (this.type == 'cross') {
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj) {
          if (o == 'shetuanmingcheng') {
            this.ruleForm.shetuanmingcheng = obj[o];
            this.ro.shetuanmingcheng = true;
            continue;
          }
          if (o == 'shetuanleixing') {
            this.ruleForm.shetuanleixing = obj[o];
            this.ro.shetuanleixing = true;
            continue;
          }
          if (o == 'shetuantupian') {
            this.ruleForm.shetuantupian = obj[o];
            this.ro.shetuantupian = true;
            continue;
          }
          if (o == 'chenglishijian') {
            this.ruleForm.chenglishijian = obj[o];
            this.ro.chenglishijian = true;
            continue;
          }
          if (o == 'shetuanrenshu') {
            this.ruleForm.shetuanrenshu = obj[o];
            this.ro.shetuanrenshu = true;
            continue;
          }
          if (o == 'zhanghao') {
            this.ruleForm.zhanghao = obj[o];
            this.ro.zhanghao = true;
            continue;
          }
          if (o == 'xingming') {
            this.ruleForm.xingming = obj[o];
            this.ro.xingming = true;
            continue;
          }
          if (o == 'lianxidianhua') {
            this.ruleForm.lianxidianhua = obj[o];
            this.ro.lianxidianhua = true;
            continue;
          }
          if (o == 'youxiang') {
            this.ruleForm.youxiang = obj[o];
            this.ro.youxiang = true;
            continue;
          }
          if (o == 'shetuanjianjie') {
            this.ruleForm.shetuanjianjie = obj[o];
            this.ro.shetuanjianjie = true;
            continue;
          }
        }
      }
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `shetuanzhuanrang/info/${id}`,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
          //解决前台上传图片后台不显示的问题
          let reg = new RegExp('../../../upload', 'g')//g代表全部
          this.ruleForm.shetuanjianjie = this.ruleForm.shetuanjianjie.replace(reg, '../../../springboot12748/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      this.$refs["ruleForm"].validate(valid => {

        let params = {
          shezhangId:this.ruleForm.shezhangId,
          zhanghao: this.ruleForm.zhanghao,
          xingming:this.ruleForm.xingming,
          shezhangXingbie: this.ruleForm.shezhangXingbie,
          shezhangShouJi: this.ruleForm.lianxidianhua,

          id: this.ruleForm.xuesheId,
          xuehao:this.ruleForm.xuehao,
          xueshengShouJi:this.ruleForm.shouji,
          xueshengxingming: this.ruleForm.xueshengxingming,
          xueshengXingbie: this.ruleForm.xuesheXingbie,

          rowId: this.rowId,
          shetuanmingcheng: this.ruleForm.shetuanmingcheng,
          shenpibeizhu: this.ruleForm.shenpibeizhu
        }

        if (valid) {
          this.$http({
            url: `shetuanzhuanrang/update`,
            method: "post",
            data: params
          }).then(({data}) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.shetuanxinxiCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.shetuanxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    shetuantupianUploadChange(fileUrls) {
      this.ruleForm.shetuantupian = fileUrls;
      this.addEditUploadStyleChange()
    },
    addEditStyleChange() {
      this.$nextTick(() => {
        // input
        document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el => {
          el.style.height = this.addEditForm.inputHeight
          el.style.color = this.addEditForm.inputFontColor
          el.style.fontSize = this.addEditForm.inputFontSize
          el.style.borderWidth = this.addEditForm.inputBorderWidth
          el.style.borderStyle = this.addEditForm.inputBorderStyle
          el.style.borderColor = this.addEditForm.inputBorderColor
          el.style.borderRadius = this.addEditForm.inputBorderRadius
          el.style.backgroundColor = this.addEditForm.inputBgColor
        })
        document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.inputHeight
          el.style.color = this.addEditForm.inputLableColor
          el.style.fontSize = this.addEditForm.inputLableFontSize
        })
        // select
        document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el => {
          el.style.height = this.addEditForm.selectHeight
          el.style.color = this.addEditForm.selectFontColor
          el.style.fontSize = this.addEditForm.selectFontSize
          el.style.borderWidth = this.addEditForm.selectBorderWidth
          el.style.borderStyle = this.addEditForm.selectBorderStyle
          el.style.borderColor = this.addEditForm.selectBorderColor
          el.style.borderRadius = this.addEditForm.selectBorderRadius
          el.style.backgroundColor = this.addEditForm.selectBgColor
        })
        document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.selectHeight
          el.style.color = this.addEditForm.selectLableColor
          el.style.fontSize = this.addEditForm.selectLableFontSize
        })
        document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el => {
          el.style.color = this.addEditForm.selectIconFontColor
          el.style.fontSize = this.addEditForm.selectIconFontSize
        })
        // date
        document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el => {
          el.style.height = this.addEditForm.dateHeight
          el.style.color = this.addEditForm.dateFontColor
          el.style.fontSize = this.addEditForm.dateFontSize
          el.style.borderWidth = this.addEditForm.dateBorderWidth
          el.style.borderStyle = this.addEditForm.dateBorderStyle
          el.style.borderColor = this.addEditForm.dateBorderColor
          el.style.borderRadius = this.addEditForm.dateBorderRadius
          el.style.backgroundColor = this.addEditForm.dateBgColor
        })
        document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.dateHeight
          el.style.color = this.addEditForm.dateLableColor
          el.style.fontSize = this.addEditForm.dateLableFontSize
        })
        document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el => {
          el.style.color = this.addEditForm.dateIconFontColor
          el.style.fontSize = this.addEditForm.dateIconFontSize
          el.style.lineHeight = this.addEditForm.dateHeight
        })
        // upload
        let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
        document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el => {
          el.style.width = this.addEditForm.uploadHeight
          el.style.height = this.addEditForm.uploadHeight
          el.style.borderWidth = this.addEditForm.uploadBorderWidth
          el.style.borderStyle = this.addEditForm.uploadBorderStyle
          el.style.borderColor = this.addEditForm.uploadBorderColor
          el.style.borderRadius = this.addEditForm.uploadBorderRadius
          el.style.backgroundColor = this.addEditForm.uploadBgColor
        })
        document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.uploadHeight
          el.style.color = this.addEditForm.uploadLableColor
          el.style.fontSize = this.addEditForm.uploadLableFontSize
        })
        document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el => {
          el.style.color = this.addEditForm.uploadIconFontColor
          el.style.fontSize = this.addEditForm.uploadIconFontSize
          el.style.lineHeight = iconLineHeight
          el.style.display = 'block'
        })
        // 多文本输入框
        document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el => {
          el.style.height = this.addEditForm.textareaHeight
          el.style.color = this.addEditForm.textareaFontColor
          el.style.fontSize = this.addEditForm.textareaFontSize
          el.style.borderWidth = this.addEditForm.textareaBorderWidth
          el.style.borderStyle = this.addEditForm.textareaBorderStyle
          el.style.borderColor = this.addEditForm.textareaBorderColor
          el.style.borderRadius = this.addEditForm.textareaBorderRadius
          el.style.backgroundColor = this.addEditForm.textareaBgColor
        })
        document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el => {
          // el.style.lineHeight = this.addEditForm.textareaHeight
          el.style.color = this.addEditForm.textareaLableColor
          el.style.fontSize = this.addEditForm.textareaLableFontSize
        })
        // 保存
        document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el => {
          el.style.width = this.addEditForm.btnSaveWidth
          el.style.height = this.addEditForm.btnSaveHeight
          el.style.color = this.addEditForm.btnSaveFontColor
          el.style.fontSize = this.addEditForm.btnSaveFontSize
          el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
          el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
          el.style.borderColor = this.addEditForm.btnSaveBorderColor
          el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
          el.style.backgroundColor = this.addEditForm.btnSaveBgColor
        })
        // 返回
        document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el => {
          el.style.width = this.addEditForm.btnCancelWidth
          el.style.height = this.addEditForm.btnCancelHeight
          el.style.color = this.addEditForm.btnCancelFontColor
          el.style.fontSize = this.addEditForm.btnCancelFontSize
          el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
          el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
          el.style.borderColor = this.addEditForm.btnCancelBorderColor
          el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
          el.style.backgroundColor = this.addEditForm.btnCancelBgColor
        })
      })
    },
    addEditUploadStyleChange() {
      this.$nextTick(() => {
        document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el => {
          el.style.width = this.addEditForm.uploadHeight
          el.style.height = this.addEditForm.uploadHeight
          el.style.borderWidth = this.addEditForm.uploadBorderWidth
          el.style.borderStyle = this.addEditForm.uploadBorderStyle
          el.style.borderColor = this.addEditForm.uploadBorderColor
          el.style.borderRadius = this.addEditForm.uploadBorderRadius
          el.style.backgroundColor = this.addEditForm.uploadBgColor
        })
      })
    },
  }
};
</script>
<style lang="scss">
.editor {
  height: 500px;

  & /deep/ .ql-container {
    height: 310px;
  }
}

.amap-wrapper {
  width: 100%;
  height: 500px;
}

.search-box {
  position: absolute;
}

.addEdit-block {
  margin: -10px;
}

.detail-form-content {
  padding: 12px;
}

.btn .el-button {
  padding: 0;
}

.addEdit-block .input .el-form-item__label {
  text-align: left;
}
</style>
