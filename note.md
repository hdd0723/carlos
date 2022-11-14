## 踩坑笔记

### springboot-04-basic
1. 测试函数写在Test包里面，并且src里面必须要又一个SpringBootApplication注解的类作为入口
2. test函数要和MainApplication.class具有相同的包路径，因为它读取的配置参数就是来自MainApplication.class
3. yml配置的时候，注意冒号之后要空一个空格
4. 同步更新git远程仓库命令，本地已有仓库推送到github
   ```bash
   git init
   git remote add origin git@github.com:hdd0723/carlos.git
   git branch -M main
   git push -u origin main
   
5. 在多配置文件环境下，可以设置有个application-dev、application-test和application-prod等多配置文件，同时还需要有个主配置文件application，指定哪个配置文件生效
   ```yaml
   spring.profiles.avtive=test
   
### springboot-05-web
1. 用thymeleaf当渲染模版，记得controller的注解一定要用Controller，而不是RestController

### springboot-07-aop
1. aop几个注解：@Aspect，@Before，@After，@Around，@AfterReturn