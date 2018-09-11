import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)
export default new Vuex.Store({
  state: {
    url: 'www.baidu.com'
  },
  mutations: {
    setUrl (state, res) {
      // 该方法用来改变全局变量的值
      state.url = res
    }
  }
})