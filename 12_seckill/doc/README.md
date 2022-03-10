
## 简介

## app制作流程
- 007功能开发前期准备工作
 - setting -> pluggin 加lombok插件
 - 启动SeckillApplication.java看是否到started启动成功，再通过网页http://localhost:8080/login/toLogin查看测试结果

- 008-009开发登录功能
 - 可以使用md5生成的密码来验证，使用mysql先赋值md5生成的密码来验证

- 010自定义注解做登录信息的拦截验证
- 011异常处理，将异常往前端抛出应答信息窗口
- 012完善登录功能：做一个是否登录成功，没有登录不能秒杀，登录成功就给一个状态可以进行秒杀

