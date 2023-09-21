<template>
  <div class="content">
    <div class="text main-text">欢迎使用 {{ this.$project.projectName }}</div>
  </div>
</template>
<script>
import router from '@/router/router-static'
// import echarts from 'echarts'
// 引入 echarts 核心模块，核心模块提供了 echarts 使用必须要的接口。
import * as echarts from 'echarts';

export default {
  mounted() {
    this.init();
    // 接下来的使用就跟之前一样，初始化图表，设置配置项
  },
  methods: {
    init() {
      if (this.$storage.get('Token')) {
        this.$http({
          url: `${this.$storage.get('sessionTable')}/session`,
          method: "get"
        }).then(({data}) => {
          if (data && data.code != 0) {
            router.push({name: 'login'})
          }
        });
      } else {
        router.push({name: 'login'})
      }
    }
  }
};
</script>

<style lang="scss" scoped>
.content {
  display: flex;
  align-items: center;
  flex-direction: column;
  width: 100%;
  height: 100%;
  min-height: 500px;
  text-align: center;
  background-color: #E6F1EC;

  .main-text {
    font-size: 38px;
    font-weight: bold;
    margin-top: 15%;
  }

  .text {
    font-size: 24px;
    font-weight: bold;
    color: #333;
  }
}
</style>