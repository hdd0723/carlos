### 踩坑笔记
1. 测试函数写在Test包里面，并且src里面必须要又一个SpringBootApplication注解的类作为入口
2. test函数要和MainApplication.class具有相同的包路径，因为它读取的配置参数就是来自MainApplication.class
3. yml配置的时候，注意冒号之后要空一个空格
4. 同步更新git远程仓库命令，本地已有仓库推送到github
   ```bash
   git init
   git remote add origin git@github.com:hdd0723/carlos.git
   git branch -M main
   git push -u origin main