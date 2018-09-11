<template>
  <div id="app">
    <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
    <!-- 顶部 -->
    <mHeader/>
    <div>
      <router-view></router-view>
    </div>
    <mfoot/>
    <div></div>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import mHeader from './components/mHeader.vue'
import mfoot from './components/mFoot.vue'
import './css/common.css'
export default {
  name: 'app',
  components: {
    HelloWorld,
    mHeader,
    mfoot,
  },
  created(){
    this.$router.push({ path: 'home' })
  }
  
}

</script>

<style>
#app {
  position: relative;
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  background:#f7f7f7;
  /* margin-top: 60px; */
  /* width: 100%; */
  /* height: 100%; */
}
</style>
