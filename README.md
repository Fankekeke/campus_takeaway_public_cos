### 基于SpringBoot + Vue的校园外卖平台.

校园点餐系统、校内配送平台、智慧食堂外卖、校园餐饮众包

###### 商家管理员：
账户登录，密码修改，用户收货地址管理，公告信息管理，餐品管理，用户评价，消息管理，订单管理，贴子管理，用户信息管理，餐品类型管理，商家信息变更，用户在线沟通，数据统计

###### 用户：
小程序注册登录，公告信息查看，商家信息，社区论坛，热销推荐，我的购物车，商家在线沟通，我的订单，收货地址管理，餐品详情

##### 商家运营与基础配置
###### 商家信息/变更： 实时维护店铺营业状态、联系方式及配送范围，确保校园服务信息准确有效。

###### 餐品类型/管理： 灵活设置餐品分类与明细，支持图片及描述上传，打造吸引师生的数字化菜单。

###### 商家信息/详情： 用户可查看商家资质、评价及距离，作为点餐参考，提升校内交易的透明度。

##### 购物流程与订单处理
###### 热销推荐/详情： 展示校园爆款餐品及实时详情，引导用户快速选购，提升订单转化与用餐体验。

###### 我的购物车： 支持多餐品灵活组合与一键结算，自动计算起送价与优惠，简化校园点餐步骤。

###### 订单管理/商家： 全流程监控接单、出餐及配送状态，确保每一份校园外卖都能准时、准确送达。

##### 物流配送与联络体系
###### 收货地址管理： 预设宿舍楼、教学楼等校园精准位置，大幅提升末端配送效率与寻址准确性。

###### 在线沟通/消息： 搭建买卖双方即时通讯通道，方便确认口味要求或配送进度，降低沟通成本。

###### 消息管理/回复： 系统自动推送订单状态变动及咨询反馈，确保关键交易信息能够实时触达。

##### 社区互动与口碑管理
###### 社区论坛/贴子： 提供校园美食分享与避雷空间，通过话题互动增强用户粘性，构建活跃社区。

###### 用户评价管理： 记录师生真实的用餐反馈，商家据此改进菜品，通过口碑积累提升店铺权重。

###### 公告信息管理： 实时发布校内优惠活动或食堂供应调整，确保平台资讯高效覆盖目标人群。

##### 数据监控与用户管理
###### 数据统计： 自动汇总销量、营收及热门菜品排行，通过可视化数据看板辅助商家科学决策。

###### 用户信息管理： 统一维护师生注册档案与权限，保障交易安全，支持精准的个性化营销推送。

#### 安装环境

JAVA 环境 

Node.js环境 [https://nodejs.org/en/] 选择14.17

Yarn 打开cmd， 输入npm install -g yarn !!!必须安装完毕nodejs

Mysql 数据库 [https://blog.csdn.net/qq_40303031/article/details/88935262] 一定要把账户和密码记住

redis

Idea 编译器 [https://blog.csdn.net/weixin_44505194/article/details/104452880]

WebStorm OR VScode 编译器 [https://www.jianshu.com/p/d63b5bae9dff]

#### 采用技术及功能

后端：SpringBoot、MybatisPlus、MySQL、Redis、
前端：Vue、Apex、Antd、Axios

平台前端：vue(框架) + vuex(全局缓存) + rue-router(路由) + axios(请求插件) + apex(图表)  + antd-ui(ui组件)

平台后台：springboot(框架) + redis(缓存中间件) + shiro(权限中间件) + mybatisplus(orm) + restful风格接口 + mysql(数据库)

开发环境：windows10 or windows7 ， vscode or webstorm ， idea + lambok


#### 前台启动方式
安装所需文件 yarn install 
运行 yarn run dev

#### 默认后台账户密码
[管理员]
admin
1234qwer

#### 项目截图
暂无

|  |  |
|---------------------|---------------------|
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/02aa5e44-5842-4f54-b9f2-8c98e83d8d20.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/cda5e1b5-e2ff-42b3-95d8-bf2ad672e9cc.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/002e85c9-7821-4a7e-914f-efda2e2c74fa.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/2511e71f-2b34-4c09-b35c-0a6f295fad54.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/0f4709cb-3aa7-4601-8f2d-b3b0437751c2.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/88a19448-7e88-4361-82cc-9a9bd40c4b46.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/0e6e8b94-9a82-480b-b28d-4d0e4ac81dc4.png) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/38d60104-b3a7-473a-89bd-695de9f56344.png) |
| ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/fc081156-8e20-4c59-abad-5446e5d0084f.png) |  |

![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/work/936e9baf53eb9a217af4f89c616dc19.png)

#### 演示视频

暂无

#### 获取方式

Email: fan1ke2ke@gmail.com

WeChat: `Storm_Berserker`

`附带部署与讲解服务，因为要恰饭资源非免费，伸手党勿扰，谢谢理解😭`

> 1.项目纯原创，不做二手贩子 2.一次购买终身有效 3.项目讲解持续到答辩结束 4.非常负责的答辩指导 5.**黑奴价格**

> 项目部署调试不好包退！功能逻辑没讲明白包退！

#### 其它资源

[2025年-答辩顺利通过-客户评价🍜](https://berserker287.github.io/2025/06/18/2025%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2024年-答辩顺利通过-客户评价👻](https://berserker287.github.io/2024/06/06/2024%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2023年-答辩顺利通过-客户评价🐢](https://berserker287.github.io/2023/06/14/2023%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2022年-答辩通过率100%-客户评价🐣](https://berserker287.github.io/2022/05/25/%E9%A1%B9%E7%9B%AE%E4%BA%A4%E6%98%93%E8%AE%B0%E5%BD%95/)

[毕业答辩导师提问的高频问题](https://berserker287.github.io/2023/06/13/%E6%AF%95%E4%B8%9A%E7%AD%94%E8%BE%A9%E5%AF%BC%E5%B8%88%E6%8F%90%E9%97%AE%E7%9A%84%E9%AB%98%E9%A2%91%E9%97%AE%E9%A2%98/)

[50个高频答辩问题-技术篇](https://berserker287.github.io/2023/06/13/50%E4%B8%AA%E9%AB%98%E9%A2%91%E7%AD%94%E8%BE%A9%E9%97%AE%E9%A2%98-%E6%8A%80%E6%9C%AF%E7%AF%87/)

[计算机毕设答辩时都会问到哪些问题？](https://www.zhihu.com/question/31020988)

[计算机专业毕业答辩小tips](https://zhuanlan.zhihu.com/p/145911029)

#### 接JAVAWEB毕设，纯原创，价格公道，诚信第一

`网站建设、小程序、H5、APP、各种系统 选题+开题报告+任务书+程序定制+安装调试+项目讲解+论文+答辩PPT`

More info: [悲伤的橘子树](https://berserker287.github.io/)

<p><img align="center" src="https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/%E5%90%88%E4%BD%9C%E7%89%A9%E6%96%99%E6%A0%B7%E5%BC%8F%20(3).png" alt="fankekeke" /></p>
