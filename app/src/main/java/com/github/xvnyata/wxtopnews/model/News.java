package com.github.xvnyata.wxtopnews.model;

import java.util.List;

/**
 * Created by xvnyata on 16-3-11.
 */
public class News  {

    /**
     * date : 20160309
     * stories : [{"images":["http://pic3.zhimg.com/7201733be8b90fcd77278b778f7e14c6.jpg"],"type":0,"id":7980068,"ga_prefix":"030922","title":"深夜惊奇 · 手术室的纸条"},{"images":["http://pic1.zhimg.com/8047f512e47cd18e70dac443d0c18590.jpg"],"type":0,"id":7953101,"ga_prefix":"030921","title":"这是最让我涕泪滂沱、不能自已的一部电影"},{"images":["http://pic4.zhimg.com/aad19554c6fbd8b085413297e2960a97.jpg"],"type":0,"id":7980114,"ga_prefix":"030920","title":"室内灯光怎样选，你需要先补一堂理论课"},{"images":["http://pic2.zhimg.com/fc0ff0d3057e6ef069b847e746547bc1.jpg"],"type":0,"id":7980133,"ga_prefix":"030919","title":"到底有没有一个最主要的原因，可以导致癌症？"},{"images":["http://pic3.zhimg.com/0e8924bdecfb3df29d7f85305a916eda.jpg"],"type":0,"id":7979395,"ga_prefix":"030918","title":"微博上单奶奶给孩子做的被动操，风险很大很严重"},{"images":["http://pic1.zhimg.com/05296822e6f672322225e18c544be95c.jpg"],"type":0,"id":7979244,"ga_prefix":"030917","title":"招聘也看脸，这是对一部分应聘者的歧视吗？"},{"images":["http://pic4.zhimg.com/0cc6de253d874415d81073e87aa90503.jpg"],"type":0,"id":7978023,"ga_prefix":"030916","title":"不麻醉靠硬撑，能不能撑过一台手术？"},{"images":["http://pic2.zhimg.com/0f4d1ce73a72f2b5d5904c7f4052f31d.jpg"],"type":0,"id":7979236,"ga_prefix":"030915","title":"刚刚击败世界围棋冠军的 AlphaGo，是怎样「思考」的？"},{"images":["http://pic3.zhimg.com/869069945f80b8a85c1114239515d3fe.jpg"],"type":0,"id":7974776,"ga_prefix":"030914","title":"梦幻指数极高，晒照片也经常出现它的身影"},{"images":["http://pic1.zhimg.com/e64a20e27c5f1510624ebf98f4344878.jpg"],"type":0,"id":7975896,"ga_prefix":"030913","title":"我的专业是母乳喂养，解答你关于喂奶的许多困惑"},{"images":["http://pic2.zhimg.com/060a8762675be82d8a3a6393900d2e31.jpg"],"type":0,"id":7973505,"ga_prefix":"030912","title":"不好的运气可以多大程度上毁掉一个人的努力？"},{"images":["http://pic3.zhimg.com/8b89903f257408f6ece1c123e8abe36e.jpg"],"type":0,"id":7978085,"ga_prefix":"030911","title":"戴了这么久的隐形眼镜，才知道它的成分是这些"},{"images":["http://pic2.zhimg.com/96b0f2da53bd324d6e8b0458a8247799.jpg"],"type":0,"id":7796161,"ga_prefix":"030910","title":"你可能也有这种感觉，中国农村的屋子越来越难看了"},{"images":["http://pic2.zhimg.com/7d64e67a3c4ecc356a3c60107f9df689.jpg"],"type":0,"id":7976401,"ga_prefix":"030909","title":"养育两个小孩，会让孩子们的心理更健康吗？"},{"images":["http://pic1.zhimg.com/49b8b7259b06bdf83c44ddd8e75d54cc.jpg"],"type":0,"id":7970603,"ga_prefix":"030908","title":"爸妈赚得多，孩子更健康，又多了一个努力赚钱的理由"},{"title":"《疯狂动物城》里不易发现的梗，我们帮你找出来了","ga_prefix":"030907","images":["http://pic1.zhimg.com/a47b79b2ac00ade5b4623f7f8b52857c.jpg"],"multipic":true,"type":0,"id":7968558},{"title":"老师说「不要用」的 Word 宏，我来教你，大大提高工作效率","ga_prefix":"030907","images":["http://pic2.zhimg.com/7813b817f7059424a043c78bab5e84b1.jpg"],"multipic":true,"type":0,"id":7976261},{"images":["http://pic4.zhimg.com/85dfde0556a3366ccec573344c447e8b.jpg"],"type":0,"id":7975803,"ga_prefix":"030907","title":"我们需要的到底是什么样的女性主义？"},{"images":["http://pic4.zhimg.com/fe2116d872d2e6d2538056767161db4b.jpg"],"type":0,"id":7976466,"ga_prefix":"030907","title":"读读日报 24 小时热门：12 件有点丑又鸡肋的家具"},{"images":["http://pic3.zhimg.com/a6a8e04fc898fe1da00eb90a143c580a.jpg"],"type":0,"id":7965741,"ga_prefix":"030906","title":"瞎扯 · 如何正确地吐槽"},{"images":["http://pic4.zhimg.com/2db8cbcbd725a30bdf8fbd201cc9201b.jpg"],"type":0,"id":7969582,"ga_prefix":"030906","title":"这里是广告 · 你以为的屌丝就真的是屌丝吗？"}]
     */

    private String date;
    private List<StoriesEntity> stories;

    public void setDate(String date) {
        this.date = date;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public String getDate() {
        return date;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public static class StoriesEntity {
        /**
         * images : ["http://pic3.zhimg.com/7201733be8b90fcd77278b778f7e14c6.jpg"]
         * type : 0
         * id : 7980068
         * ga_prefix : 030922
         * title : 深夜惊奇 · 手术室的纸条
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public void setType(int type) {
            this.type = type;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public List<String> getImages() {
            return images;
        }
    }
}
