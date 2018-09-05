package com.abner.fff.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class XingPianChangVideoResp {

    /**
     * status : 0
     * msg : ok
     * data : {"expand":"resource,tag,category,resource_origin","vid":"5B7F886020876","video":{"source_type":1,"source_link":"http://video-private.xinpianchang.com/5b7f81534c78c.mp4","title":"Feel The Pulse 律随心动","cover":"https://cs.xinpianchang.com/uploadfile/article/2018/08/24/5b7f885d25aba.jpeg","regisseur":"","filmmaking":"","duration":197000,"preview_image_path":"","preview_video_path":"","score":"0.0","origin_title":"","origin_website_link":"","origin_resource_link":"","subtitles_link":"","property":"1","description":"","is_vr":0,"status":3,"embed":[{"type":"iframe","iframe_url":"https://openapi-vtom.vmovier.com/video/5B7F886020876"}]},"resource":{"default":{"id":619434,"profile":"高清","profile_code":"mp4-HD","bucket":"xinpianchang","key":"5b7f886280aef.mp4","sha1":"","md5":"","filesize":62596555,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","video_bitrate":2529767,"video_codec_name":"h264","width":1280,"height":720,"coded_width":1280,"coded_height":720,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},"hls":[],"progressive":[{"id":619436,"profile":"2K","profile_code":"mp4-2K","bucket":"xinpianchang","key":"5b7f886261ca5.mp4","sha1":"","md5":"","filesize":198677516,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4","video_bitrate":8029320,"video_codec_name":"h264","width":2560,"height":1440,"coded_width":2560,"coded_height":1440,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619435,"profile":"1080P","profile_code":"mp4-FHD","bucket":"xinpianchang","key":"5b7f886273aac.mp4","sha1":"","md5":"","filesize":126090417,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886273aac.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886273aac.mp4","video_bitrate":5095797,"video_codec_name":"h264","width":1920,"height":1080,"coded_width":1920,"coded_height":1080,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619434,"profile":"高清","profile_code":"mp4-HD","bucket":"xinpianchang","key":"5b7f886280aef.mp4","sha1":"","md5":"","filesize":62596555,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","video_bitrate":2529767,"video_codec_name":"h264","width":1280,"height":720,"coded_width":1280,"coded_height":720,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619433,"profile":"标清","profile_code":"mp4-SD","bucket":"xinpianchang","key":"5b7f88628d8a4.mp4","sha1":"","md5":"","filesize":40569173,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88628d8a4.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88628d8a4.mp4","video_bitrate":1639555,"video_codec_name":"h264","width":960,"height":540,"coded_width":960,"coded_height":540,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619432,"profile":"流畅","profile_code":"mp4-LD","bucket":"xinpianchang","key":"5b7f88629d627.mp4","sha1":"","md5":"","filesize":18351220,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","video_bitrate":741643,"video_codec_name":"h264","width":640,"height":360,"coded_width":640,"coded_height":360,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"}],"lowest":{"id":619432,"profile":"流畅","profile_code":"mp4-LD","bucket":"xinpianchang","key":"5b7f88629d627.mp4","sha1":"","md5":"","filesize":18351220,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","video_bitrate":741643,"video_codec_name":"h264","width":640,"height":360,"coded_width":640,"coded_height":360,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"}}}
     */

    private int status;
    private String msg;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * expand : resource,tag,category,resource_origin
         * vid : 5B7F886020876
         * video : {"source_type":1,"source_link":"http://video-private.xinpianchang.com/5b7f81534c78c.mp4","title":"Feel The Pulse 律随心动","cover":"https://cs.xinpianchang.com/uploadfile/article/2018/08/24/5b7f885d25aba.jpeg","regisseur":"","filmmaking":"","duration":197000,"preview_image_path":"","preview_video_path":"","score":"0.0","origin_title":"","origin_website_link":"","origin_resource_link":"","subtitles_link":"","property":"1","description":"","is_vr":0,"status":3,"embed":[{"type":"iframe","iframe_url":"https://openapi-vtom.vmovier.com/video/5B7F886020876"}]}
         * resource : {"default":{"id":619434,"profile":"高清","profile_code":"mp4-HD","bucket":"xinpianchang","key":"5b7f886280aef.mp4","sha1":"","md5":"","filesize":62596555,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","video_bitrate":2529767,"video_codec_name":"h264","width":1280,"height":720,"coded_width":1280,"coded_height":720,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},"hls":[],"progressive":[{"id":619436,"profile":"2K","profile_code":"mp4-2K","bucket":"xinpianchang","key":"5b7f886261ca5.mp4","sha1":"","md5":"","filesize":198677516,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4","video_bitrate":8029320,"video_codec_name":"h264","width":2560,"height":1440,"coded_width":2560,"coded_height":1440,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619435,"profile":"1080P","profile_code":"mp4-FHD","bucket":"xinpianchang","key":"5b7f886273aac.mp4","sha1":"","md5":"","filesize":126090417,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886273aac.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886273aac.mp4","video_bitrate":5095797,"video_codec_name":"h264","width":1920,"height":1080,"coded_width":1920,"coded_height":1080,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619434,"profile":"高清","profile_code":"mp4-HD","bucket":"xinpianchang","key":"5b7f886280aef.mp4","sha1":"","md5":"","filesize":62596555,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","video_bitrate":2529767,"video_codec_name":"h264","width":1280,"height":720,"coded_width":1280,"coded_height":720,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619433,"profile":"标清","profile_code":"mp4-SD","bucket":"xinpianchang","key":"5b7f88628d8a4.mp4","sha1":"","md5":"","filesize":40569173,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88628d8a4.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88628d8a4.mp4","video_bitrate":1639555,"video_codec_name":"h264","width":960,"height":540,"coded_width":960,"coded_height":540,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619432,"profile":"流畅","profile_code":"mp4-LD","bucket":"xinpianchang","key":"5b7f88629d627.mp4","sha1":"","md5":"","filesize":18351220,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","video_bitrate":741643,"video_codec_name":"h264","width":640,"height":360,"coded_width":640,"coded_height":360,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"}],"lowest":{"id":619432,"profile":"流畅","profile_code":"mp4-LD","bucket":"xinpianchang","key":"5b7f88629d627.mp4","sha1":"","md5":"","filesize":18351220,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","video_bitrate":741643,"video_codec_name":"h264","width":640,"height":360,"coded_width":640,"coded_height":360,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"}}
         */

        private String expand;
        private String vid;
        private VideoBean video;
        private ResourceBean resource;

        public String getExpand() {
            return expand;
        }

        public void setExpand(String expand) {
            this.expand = expand;
        }

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public ResourceBean getResource() {
            return resource;
        }

        public void setResource(ResourceBean resource) {
            this.resource = resource;
        }

        public static class VideoBean {
            /**
             * source_type : 1
             * source_link : http://video-private.xinpianchang.com/5b7f81534c78c.mp4
             * title : Feel The Pulse 律随心动
             * cover : https://cs.xinpianchang.com/uploadfile/article/2018/08/24/5b7f885d25aba.jpeg
             * regisseur :
             * filmmaking :
             * duration : 197000
             * preview_image_path :
             * preview_video_path :
             * score : 0.0
             * origin_title :
             * origin_website_link :
             * origin_resource_link :
             * subtitles_link :
             * property : 1
             * description :
             * is_vr : 0
             * status : 3
             * embed : [{"type":"iframe","iframe_url":"https://openapi-vtom.vmovier.com/video/5B7F886020876"}]
             */

            private int source_type;
            private String source_link;
            private String title;
            private String cover;
            private String regisseur;
            private String filmmaking;
            private int duration;
            private String preview_image_path;
            private String preview_video_path;
            private String score;
            private String origin_title;
            private String origin_website_link;
            private String origin_resource_link;
            private String subtitles_link;
            private String property;
            private String description;
            private int is_vr;
            private int status;
            private List<EmbedBean> embed;

            public int getSource_type() {
                return source_type;
            }

            public void setSource_type(int source_type) {
                this.source_type = source_type;
            }

            public String getSource_link() {
                return source_link;
            }

            public void setSource_link(String source_link) {
                this.source_link = source_link;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getRegisseur() {
                return regisseur;
            }

            public void setRegisseur(String regisseur) {
                this.regisseur = regisseur;
            }

            public String getFilmmaking() {
                return filmmaking;
            }

            public void setFilmmaking(String filmmaking) {
                this.filmmaking = filmmaking;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public String getPreview_image_path() {
                return preview_image_path;
            }

            public void setPreview_image_path(String preview_image_path) {
                this.preview_image_path = preview_image_path;
            }

            public String getPreview_video_path() {
                return preview_video_path;
            }

            public void setPreview_video_path(String preview_video_path) {
                this.preview_video_path = preview_video_path;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getOrigin_title() {
                return origin_title;
            }

            public void setOrigin_title(String origin_title) {
                this.origin_title = origin_title;
            }

            public String getOrigin_website_link() {
                return origin_website_link;
            }

            public void setOrigin_website_link(String origin_website_link) {
                this.origin_website_link = origin_website_link;
            }

            public String getOrigin_resource_link() {
                return origin_resource_link;
            }

            public void setOrigin_resource_link(String origin_resource_link) {
                this.origin_resource_link = origin_resource_link;
            }

            public String getSubtitles_link() {
                return subtitles_link;
            }

            public void setSubtitles_link(String subtitles_link) {
                this.subtitles_link = subtitles_link;
            }

            public String getProperty() {
                return property;
            }

            public void setProperty(String property) {
                this.property = property;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getIs_vr() {
                return is_vr;
            }

            public void setIs_vr(int is_vr) {
                this.is_vr = is_vr;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<EmbedBean> getEmbed() {
                return embed;
            }

            public void setEmbed(List<EmbedBean> embed) {
                this.embed = embed;
            }

            public static class EmbedBean {
                /**
                 * type : iframe
                 * iframe_url : https://openapi-vtom.vmovier.com/video/5B7F886020876
                 */

                private String type;
                private String iframe_url;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getIframe_url() {
                    return iframe_url;
                }

                public void setIframe_url(String iframe_url) {
                    this.iframe_url = iframe_url;
                }
            }
        }

        public static class ResourceBean {
            /**
             * default : {"id":619434,"profile":"高清","profile_code":"mp4-HD","bucket":"xinpianchang","key":"5b7f886280aef.mp4","sha1":"","md5":"","filesize":62596555,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","video_bitrate":2529767,"video_codec_name":"h264","width":1280,"height":720,"coded_width":1280,"coded_height":720,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"}
             * hls : []
             * progressive : [{"id":619436,"profile":"2K","profile_code":"mp4-2K","bucket":"xinpianchang","key":"5b7f886261ca5.mp4","sha1":"","md5":"","filesize":198677516,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4","video_bitrate":8029320,"video_codec_name":"h264","width":2560,"height":1440,"coded_width":2560,"coded_height":1440,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619435,"profile":"1080P","profile_code":"mp4-FHD","bucket":"xinpianchang","key":"5b7f886273aac.mp4","sha1":"","md5":"","filesize":126090417,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886273aac.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886273aac.mp4","video_bitrate":5095797,"video_codec_name":"h264","width":1920,"height":1080,"coded_width":1920,"coded_height":1080,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619434,"profile":"高清","profile_code":"mp4-HD","bucket":"xinpianchang","key":"5b7f886280aef.mp4","sha1":"","md5":"","filesize":62596555,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4","video_bitrate":2529767,"video_codec_name":"h264","width":1280,"height":720,"coded_width":1280,"coded_height":720,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619433,"profile":"标清","profile_code":"mp4-SD","bucket":"xinpianchang","key":"5b7f88628d8a4.mp4","sha1":"","md5":"","filesize":40569173,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88628d8a4.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88628d8a4.mp4","video_bitrate":1639555,"video_codec_name":"h264","width":960,"height":540,"coded_width":960,"coded_height":540,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"},{"id":619432,"profile":"流畅","profile_code":"mp4-LD","bucket":"xinpianchang","key":"5b7f88629d627.mp4","sha1":"","md5":"","filesize":18351220,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","video_bitrate":741643,"video_codec_name":"h264","width":640,"height":360,"coded_width":640,"coded_height":360,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"}]
             * lowest : {"id":619432,"profile":"流畅","profile_code":"mp4-LD","bucket":"xinpianchang","key":"5b7f88629d627.mp4","sha1":"","md5":"","filesize":18351220,"duration":197952,"url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","https_url":"https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4","video_bitrate":741643,"video_codec_name":"h264","width":640,"height":360,"coded_width":640,"coded_height":360,"sample_aspect_ratio":"0:1","display_aspect_ratio":"0:1"}
             */

            @SerializedName("default")
            private DefaultBean defaultX;
            private LowestBean lowest;
            private List<?> hls;
            private List<ProgressiveBean> progressive;

            public DefaultBean getDefaultX() {
                return defaultX;
            }

            public void setDefaultX(DefaultBean defaultX) {
                this.defaultX = defaultX;
            }

            public LowestBean getLowest() {
                return lowest;
            }

            public void setLowest(LowestBean lowest) {
                this.lowest = lowest;
            }

            public List<?> getHls() {
                return hls;
            }

            public void setHls(List<?> hls) {
                this.hls = hls;
            }

            public List<ProgressiveBean> getProgressive() {
                return progressive;
            }

            public void setProgressive(List<ProgressiveBean> progressive) {
                this.progressive = progressive;
            }

            public static class DefaultBean {
                /**
                 * id : 619434
                 * profile : 高清
                 * profile_code : mp4-HD
                 * bucket : xinpianchang
                 * key : 5b7f886280aef.mp4
                 * sha1 :
                 * md5 :
                 * filesize : 62596555
                 * duration : 197952
                 * url : https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4
                 * https_url : https://qiniu-xpc0.xpccdn.com/5b7f886280aef.mp4
                 * video_bitrate : 2529767
                 * video_codec_name : h264
                 * width : 1280
                 * height : 720
                 * coded_width : 1280
                 * coded_height : 720
                 * sample_aspect_ratio : 0:1
                 * display_aspect_ratio : 0:1
                 */

                private int id;
                private String profile;
                private String profile_code;
                private String bucket;
                private String key;
                private String sha1;
                private String md5;
                private int filesize;
                private int duration;
                private String url;
                private String https_url;
                private int video_bitrate;
                private String video_codec_name;
                private int width;
                private int height;
                private int coded_width;
                private int coded_height;
                private String sample_aspect_ratio;
                private String display_aspect_ratio;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getProfile() {
                    return profile;
                }

                public void setProfile(String profile) {
                    this.profile = profile;
                }

                public String getProfile_code() {
                    return profile_code;
                }

                public void setProfile_code(String profile_code) {
                    this.profile_code = profile_code;
                }

                public String getBucket() {
                    return bucket;
                }

                public void setBucket(String bucket) {
                    this.bucket = bucket;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getSha1() {
                    return sha1;
                }

                public void setSha1(String sha1) {
                    this.sha1 = sha1;
                }

                public String getMd5() {
                    return md5;
                }

                public void setMd5(String md5) {
                    this.md5 = md5;
                }

                public int getFilesize() {
                    return filesize;
                }

                public void setFilesize(int filesize) {
                    this.filesize = filesize;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHttps_url() {
                    return https_url;
                }

                public void setHttps_url(String https_url) {
                    this.https_url = https_url;
                }

                public int getVideo_bitrate() {
                    return video_bitrate;
                }

                public void setVideo_bitrate(int video_bitrate) {
                    this.video_bitrate = video_bitrate;
                }

                public String getVideo_codec_name() {
                    return video_codec_name;
                }

                public void setVideo_codec_name(String video_codec_name) {
                    this.video_codec_name = video_codec_name;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getCoded_width() {
                    return coded_width;
                }

                public void setCoded_width(int coded_width) {
                    this.coded_width = coded_width;
                }

                public int getCoded_height() {
                    return coded_height;
                }

                public void setCoded_height(int coded_height) {
                    this.coded_height = coded_height;
                }

                public String getSample_aspect_ratio() {
                    return sample_aspect_ratio;
                }

                public void setSample_aspect_ratio(String sample_aspect_ratio) {
                    this.sample_aspect_ratio = sample_aspect_ratio;
                }

                public String getDisplay_aspect_ratio() {
                    return display_aspect_ratio;
                }

                public void setDisplay_aspect_ratio(String display_aspect_ratio) {
                    this.display_aspect_ratio = display_aspect_ratio;
                }
            }

            public static class LowestBean {
                /**
                 * id : 619432
                 * profile : 流畅
                 * profile_code : mp4-LD
                 * bucket : xinpianchang
                 * key : 5b7f88629d627.mp4
                 * sha1 :
                 * md5 :
                 * filesize : 18351220
                 * duration : 197952
                 * url : https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4
                 * https_url : https://qiniu-xpc0.xpccdn.com/5b7f88629d627.mp4
                 * video_bitrate : 741643
                 * video_codec_name : h264
                 * width : 640
                 * height : 360
                 * coded_width : 640
                 * coded_height : 360
                 * sample_aspect_ratio : 0:1
                 * display_aspect_ratio : 0:1
                 */

                private int id;
                private String profile;
                private String profile_code;
                private String bucket;
                private String key;
                private String sha1;
                private String md5;
                private int filesize;
                private int duration;
                private String url;
                private String https_url;
                private int video_bitrate;
                private String video_codec_name;
                private int width;
                private int height;
                private int coded_width;
                private int coded_height;
                private String sample_aspect_ratio;
                private String display_aspect_ratio;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getProfile() {
                    return profile;
                }

                public void setProfile(String profile) {
                    this.profile = profile;
                }

                public String getProfile_code() {
                    return profile_code;
                }

                public void setProfile_code(String profile_code) {
                    this.profile_code = profile_code;
                }

                public String getBucket() {
                    return bucket;
                }

                public void setBucket(String bucket) {
                    this.bucket = bucket;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getSha1() {
                    return sha1;
                }

                public void setSha1(String sha1) {
                    this.sha1 = sha1;
                }

                public String getMd5() {
                    return md5;
                }

                public void setMd5(String md5) {
                    this.md5 = md5;
                }

                public int getFilesize() {
                    return filesize;
                }

                public void setFilesize(int filesize) {
                    this.filesize = filesize;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHttps_url() {
                    return https_url;
                }

                public void setHttps_url(String https_url) {
                    this.https_url = https_url;
                }

                public int getVideo_bitrate() {
                    return video_bitrate;
                }

                public void setVideo_bitrate(int video_bitrate) {
                    this.video_bitrate = video_bitrate;
                }

                public String getVideo_codec_name() {
                    return video_codec_name;
                }

                public void setVideo_codec_name(String video_codec_name) {
                    this.video_codec_name = video_codec_name;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getCoded_width() {
                    return coded_width;
                }

                public void setCoded_width(int coded_width) {
                    this.coded_width = coded_width;
                }

                public int getCoded_height() {
                    return coded_height;
                }

                public void setCoded_height(int coded_height) {
                    this.coded_height = coded_height;
                }

                public String getSample_aspect_ratio() {
                    return sample_aspect_ratio;
                }

                public void setSample_aspect_ratio(String sample_aspect_ratio) {
                    this.sample_aspect_ratio = sample_aspect_ratio;
                }

                public String getDisplay_aspect_ratio() {
                    return display_aspect_ratio;
                }

                public void setDisplay_aspect_ratio(String display_aspect_ratio) {
                    this.display_aspect_ratio = display_aspect_ratio;
                }
            }

            public static class ProgressiveBean {
                /**
                 * id : 619436
                 * profile : 2K
                 * profile_code : mp4-2K
                 * bucket : xinpianchang
                 * key : 5b7f886261ca5.mp4
                 * sha1 :
                 * md5 :
                 * filesize : 198677516
                 * duration : 197952
                 * url : https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4
                 * https_url : https://qiniu-xpc0.xpccdn.com/5b7f886261ca5.mp4
                 * video_bitrate : 8029320
                 * video_codec_name : h264
                 * width : 2560
                 * height : 1440
                 * coded_width : 2560
                 * coded_height : 1440
                 * sample_aspect_ratio : 0:1
                 * display_aspect_ratio : 0:1
                 */

                private int id;
                private String profile;
                private String profile_code;
                private String bucket;
                private String key;
                private String sha1;
                private String md5;
                private int filesize;
                private int duration;
                private String url;
                private String https_url;
                private int video_bitrate;
                private String video_codec_name;
                private int width;
                private int height;
                private int coded_width;
                private int coded_height;
                private String sample_aspect_ratio;
                private String display_aspect_ratio;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getProfile() {
                    return profile;
                }

                public void setProfile(String profile) {
                    this.profile = profile;
                }

                public String getProfile_code() {
                    return profile_code;
                }

                public void setProfile_code(String profile_code) {
                    this.profile_code = profile_code;
                }

                public String getBucket() {
                    return bucket;
                }

                public void setBucket(String bucket) {
                    this.bucket = bucket;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getSha1() {
                    return sha1;
                }

                public void setSha1(String sha1) {
                    this.sha1 = sha1;
                }

                public String getMd5() {
                    return md5;
                }

                public void setMd5(String md5) {
                    this.md5 = md5;
                }

                public int getFilesize() {
                    return filesize;
                }

                public void setFilesize(int filesize) {
                    this.filesize = filesize;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHttps_url() {
                    return https_url;
                }

                public void setHttps_url(String https_url) {
                    this.https_url = https_url;
                }

                public int getVideo_bitrate() {
                    return video_bitrate;
                }

                public void setVideo_bitrate(int video_bitrate) {
                    this.video_bitrate = video_bitrate;
                }

                public String getVideo_codec_name() {
                    return video_codec_name;
                }

                public void setVideo_codec_name(String video_codec_name) {
                    this.video_codec_name = video_codec_name;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getCoded_width() {
                    return coded_width;
                }

                public void setCoded_width(int coded_width) {
                    this.coded_width = coded_width;
                }

                public int getCoded_height() {
                    return coded_height;
                }

                public void setCoded_height(int coded_height) {
                    this.coded_height = coded_height;
                }

                public String getSample_aspect_ratio() {
                    return sample_aspect_ratio;
                }

                public void setSample_aspect_ratio(String sample_aspect_ratio) {
                    this.sample_aspect_ratio = sample_aspect_ratio;
                }

                public String getDisplay_aspect_ratio() {
                    return display_aspect_ratio;
                }

                public void setDisplay_aspect_ratio(String display_aspect_ratio) {
                    this.display_aspect_ratio = display_aspect_ratio;
                }
            }
        }
    }
}
