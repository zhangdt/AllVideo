<template>
    <div id="home">
        <ul class = "video-list">
            <li  v-for=" (video,index) in videos"  :key="index" :class="liclassObject(index)" @mouseenter="enter(index)" @mouseleave="leave()" >
                <a class="video-cover">
					<img class="lazy-img" :src="video.headerImage">
					<!-- <span class="duration fs_12">01' 19''</span> -->
					<!-- <div class="video-cover-con"> -->
						<!-- <div class="video-mark"> -->
                            <!-- <span class="pick square"><svg width="24" height="24" viewBox="0 0 60 60" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="web切片" transform="translate(-911.000000, -490.000000)"><g id="Group" transform="translate(911.000000, 490.000000)"><circle id="Oval-8" fill="#000000" cx="30" cy="30" r="30"></circle><polygon id="Rectangle-7-Copy" fill="#F7F7F7" points="21.5625 17.8125 38.4375 17.8125 38.4375 42.1875 30 35.5397727 21.5625 42.1875"></polygon></g></g></g></svg></span> -->
						<!-- </div> -->
						<!-- <p class="fs_12"> - </p> -->
					<!-- </div> -->
					<!-- <div class="video-hover-con">
						<div class="fs_12 fw_300 c_w_f desc line-hide-3">当女人穿上高跟鞋，一切由她掌控</div>
						<p class="fs_12">2018-09-03 发布</p>
					</div> -->
				</a>
                <div class="video-con">
                    <div class="video-con-top">
						<a href="javascript:;">
							<p class="fs_14 fw_600 c_b_3 line-hide-1">{{video.title}}</p>
						</a>	
						<div class="new-cate">
							<span class="fs_12 fw_300 c_b_9">
														广告 - 服装配饰							</span>
														<span class="i-icon v-center"></span>
							<span class="fs_12 fw_300 c_b_9">
							创意混剪 - 创意							</span>
													</div>
						<div class="video-view fs_12 fw_300 c_b_9">
							<span class="fw_300 icon-play-volume">1597</span>
							<span class="fw_300 c_b_9 icon-like">84</span>
						</div>
					</div>    
                </div>
            </li>
        </ul>
    </div>
</template>
<script>
import api from "../api/index.js";
export default {
  data(){
      return {
          videos:[],
          seen:false,
          current:0
      }
  },
  computed: {
  liclassObject(){
      return function (index) {
          return {
              'view-float':this.seen&&this.current == index 
    }
  }
  }
},
  created() {
    api
      .getVideosByTag("XingPianChang")
      .then(data => {
        console.log(data.data.data);
        this.videos = data.data.data;
      })
      .catch(error => {
        console.log(Promise.reject(error));
      });
  },
  methods:{
      enter(index){
        this.seen = true;
        this.current = index;
        // console.log(this.current)
      },
      leave(){
        this.seen = false;
        this.current = null;
        // console.log(this.current)
      }
    }

};
</script>
<style>

#home {
  background: #f7f7f7;
  margin: 0 auto;
}
ul {
  width: 1140px;
  margin: 0 auto;
  list-style: none;
}
li {
  display: list-item;
  text-align: -webkit-match-parent;
}
a {
  text-decoration: none;
  display: inline-block;
  color: #333;
}
.video-con{
    width: 270px;
}
.video-cover .video-cover-con {
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  transition: 0.15s ease-in-out;
  -webkit-transition: 0.15s ease-in-out;
  -moz-transition: 0.15s ease-in-out;
  -ms-transition: 0.15s ease-in-out;
  -o-transition: 0.15s ease-in-out;
  opacity: 1;
}
.video-list {
  font-size: 0;
}
.video-list > li {
  display: inline-block;
  background: #fff;
  margin: 7px 7px 7px 7px;
  vertical-align: top;
  transition: all 0.15s ease;
  -webkit-transition: all 0.15s ease;
  -moz-transition: all 0.15s ease;
  -ms-transition: all 0.15s ease;
  -o-transition: all 0.15s ease;
}
.video-cover {
  position: relative;
}
.video-cover > img,
.video-cover .cover-loading {
  width: 270px;
  height: 162px;
  background: #f0f0f0;
}

.video-con .video-con-top {
    padding: 16px;
}
.view-float{
    box-shadow:1px 1px 1px 1px #cccccc;
}
</style>
