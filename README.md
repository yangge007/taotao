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

