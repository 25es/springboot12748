<template>
  <div class="main-content">
    <el-tooltip placement="top" style="margin-left: auto">
      <div slot="content">
        社团星级规则：
      </div>
      <div slot="content">
        一星社团：社团每年举办活动小于等于五个
      </div>
      <div slot="content">
        二星社团：社团每年举办活动五个到十个且社团人数不少于20人
      </div>
      <div slot="content">
        三星社团：社团每年举办活动十个以上且人数不少于40人
      </div>
      <i style="font-size: 41px;padding-right: 30px" class="el-icon-question"/>
    </el-tooltip>
    <div id="sectorActivity" style="height: 400px; width: 100%"></div>
    <div id="sectorPopulation" style="height: 400px; width: 100%"></div>
  </div>
</template>
<script>

import * as echarts from "echarts";

export default {
  data() {
    return {
      shetuanleixingOptions: '',
      shetuanshijirenshuOptions: '',
      shetuanmingchengByHuodong: [],
      shetuanmingchengByRenshu: [],
      shetuanrenshu: [],
      shetuanhuodong: [],
      dataList: []
    };
  },
  created() {
    this.init();
  },
  mounted() {
  },
  methods: {
    init() {
      this.$http({
        url: `shetuanxinxi/pageTotalPage`,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.shetuanleixingOptions = data.data;

          for (var p in this.shetuanleixingOptions) {
            this.shetuanmingchengByHuodong.push(String(this.shetuanleixingOptions[p]["shetuanmingcheng"]))
            this.shetuanhuodong.push(parseInt(this.shetuanleixingOptions[p]["huodonggeshu"]))
          }
          var myChartActivity = echarts.init(document.getElementById('sectorActivity'));

          myChartActivity.setOption({
            title: {
              text: "社团活动"
            },
            tooltip: {},
            xAxis: {
              data: this.shetuanmingchengByHuodong
            },
            interval: 1,
            yAxis: {},
            series: [
              {
                name: '活动个数',
                type: 'bar',
                data: this.shetuanhuodong
              }
            ]
          });
        } else {
          this.$message.error(data.msg);
        }
      });

      this.$http({
        url: `shetuanshenqing/queryShijirenshu`,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.shetuanshijirenshuOptions = data.data;

          for (var p in this.shetuanshijirenshuOptions) {
            this.shetuanmingchengByRenshu.push(String(this.shetuanshijirenshuOptions[p]["shetuanmingcheng"]))
            this.shetuanrenshu.push(parseInt(this.shetuanshijirenshuOptions[p]["shijirenshu"]))
          }
          var myChartPopulation = echarts.init(document.getElementById('sectorPopulation'));

          myChartPopulation.setOption({
            title: {
              text: "社团人数"
            },
            tooltip: {},
            xAxis: {
              data: this.shetuanmingchengByRenshu
            },
            yAxis: {},
            interval: 1,
            series: [
              {
                name: '人数',
                type: 'bar',
                data: this.shetuanrenshu
              }
            ]
          });
        } else {
          this.$message.error(data.msg);
        }
      });

    },
  }

};
</script>
<style lang="scss" scoped>
.slt {
  margin: 0 !important;
  display: flex;
}

.main-content {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;

}

.ad {
  margin: 0 !important;
  display: flex;
}


</style>
