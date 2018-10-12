# 上传代码到github
1.去github上创建自己的repository
new->..
clone or download -> use ssh/use https -> copy

2.echo '# test' >> README.md(此步骤不用白，省略可以正常上传)

3.建立git仓库
git init

4.将项目的所有文件添加到仓库中
git add .

5.
git add README.md(报错，但不影响执行)

6.提交到仓库
git commit -m "注释语句"

7.将本地的仓库关联到github，后面https改成刚刚自己的地址
git remote add origin https://github.com/yangge007/taotao.git

8.上传github之前pull一下
git pull origin master

9.上传代码到github远程仓库
git push -u origin master

	注意：此步骤曾报错：fatal: refusing to merge unrelated histories

	原因：
	如果合并了两个不同的开始提交的仓库，在新的 git 会发现这两个仓库可能不是同一个，为了防止开发者上传错误，于是就给下面的提示
	fatal: refusing to merge unrelated histories
	如我在Github新建一个仓库，写了License，然后把本地一个写了很久仓库上传。这时会发现 github 的仓库和本地的没有一个共同的 commit 所以 git 不让提交，认为是写错了 origin ，如果开发者确定是这个 origin 就可以使用 --allow-unrelated-histories 告诉 git 自己确定

	解决：	git pull origin master --allow-unrelated-histories
			git push -u origin master
			即可解决

10.输入用户名和密码，执行完毕，没有报错，则等待执行完就上传成功了。



# 更新

1.查看当前git仓库状态，可以使用git status
git status

2.更新全部
git add *

3.提交
git commit -m "更新说明"

4.线git pull,拉去当前分之最新代码
git pull

5.push到远程master分支上
git push origin master

打开github已经同步完成


# 项目介绍

淘淘商城 
后台搭建
	使用maven管理
	聚合工程
	创建maven模块
svn使用
	工程上传
	下载工程（转换成maven工程）
ssm框架整合

问题1：模块之间相互调用找不到包
解决：删掉，重新创建一个新的模块

问题2：debug无法找到源码
解决：
1.edit Source Lookup Path... -> Add... Java Project -> 
OK -> select my project
2.debug -> debug configurations... -> Add ...

问题3：发送请求之后，在dao层访问数据库 一直处于等待状态
数据库名字，数据库账号和密码 查看是否匹配

# 计划
1.商品列表查询工程
	Easyui
	分页处理，分页插件
2.商品的添加
	商品类目选择 easyui异步tree空间的使用
	图片上传（图片服务器，nginx）
	富文本编辑器使用
	添加的实现

## 分页插件

单表查询：SELECT * FROM tb_item LIMIT 0,10;

### 使用方法

1.需要在sqlMapConfig.xml配置一个plugin。
2.在sql语句执行之前，添加一个PageHelper.startPage(page,rows)。
3.取分页结果。创建一个PageInfo对象，需要一个参数，查询结果返回的list。从PageInfo对象中取分页结果。

## 问题：maven cannot find symbol
解决：maven install全部


# 添加商品

## 商品类目


# 图片上传

# linux 系统安装
问题：配置网络问题？
解决：桥接方式连接，配置虚拟网卡，选择桥接的那块网卡（有线网卡，无线网卡）,选错会连不上网。


传统方式

# nginx

## 环境配置
1.nginx是c语言开发，gcc环境
  yum install gcc-c++
2.pcre
  yum install -y pcre pcre-devel
3.zlib
  yum install -y zlib zlib-devel
4.openssl
  yum install -y openssl openssl-devel

## nginx安装
1.把nginx源码上传到linux系统
2.解压缩
3.进行configure
注意：上边将临时文件目录指定为/var/temp/nginx，需要在/var下创建temp及nginx目录
4.make
5.make install

## 启动和停止

启动：进入nginx的bin目录 ./nginx即可启动
重新加载：./nginx -s reload

VMware虚拟机中的CentOS7安装Nginx后本机无法访问的解决办法
在linux上安装nginx 请参考： Linux Centos7 安装 nginx

在虚拟机centos7上安装nginx之后虚拟机内能访问，真机不能访问，修改iptables配置也不起作用，最后上网查找了资料后才发现centos的防火墙改成了firewall,不再叫iptables,开放端口的方法如下：

firewall-cmd --zone=public --add-port=80/tcp --permanent  
1
命令含义：

–zone #作用域

–add-port=80/tcp #添加端口，格式为：端口/通讯协议

–permanent #永久生效，没有此参数重启后失效

重启防火墙：

systemctl stop firewalld.service  
systemctl start firewalld.service  

# nginx反向代理

正向代理，反向代理区别：https://www.cnblogs.com/Anker/p/6056540.html

# 配置linux 的 vsftp服务器

1.检测是否安装vsftp服务器
rpm -qa |grep vsftpd

2.安装vsftp服务器
yum install vsftpd -y

3.启动服务
service vsftpd start
停止：service vsftpd stop
重启：service vsftpd restart

参考地址：https://jingyan.baidu.com/article/380abd0a77ae041d90192cf4.html

useradd test
passwd test

## 负载均衡
upstream weight 默认是1，权重

# 图片服务器的搭建

## fasetDFS搭建


./configure \
--prefix=/usr/local/nginx \
--pid-path=/var/run/nginx/nginx.pid \
--lock-path=/var/lock/nginx.lock \
--error-log-path=/var/log/nginx/error.log \
--http-log-path=/var/log/nginx/access.log \
--with-http_gzip_static_module \
--http-client-body-temp-path=/var/temp/nginx/client \
--http-proxy-temp-path=/var/temp/nginx/proxy \
--http-fastcgi-temp-path=/var/temp/nginx/fastcgi \
--http-uwsgi-temp-path=/var/temp/nginx/uwsgi \
--http-scgi-temp-path=/var/temp/nginx/scgi \
--add-module=/root/fastdfs-nginx-module/src


# 图片服务器使用

官方提供了一个jar包

