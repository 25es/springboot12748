const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot12748/",
            name: "springboot12748",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot12748/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生社团管理系统"
        } 
    }
}
export default base
