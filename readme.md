## donate-server
> 校友众筹项目后端开发仓库

### 1. 协作规范
本仓库有2个分支，master和dev。主要在dev分支上进行开发和测试，功能完善之后再合并到master。
```
├─master
└─dev
```
#### 1.1、准备工作

在github上fork本仓库到你自己的github，将你fork之后的远程仓库克隆到本地，并在你的本地仓库上添加上游仓库，即源仓库。fork一般是fork了仓库的master分支，所以可能还需要自己去切出dev分支然后拉取源仓库dev分支上的内容。

```
git clone https://github.com/{你的github}/donate-server
# 上游的源仓库地址只需添加一次
git remote add upstream https://github.com/SikeX/donate-server.git
# 切出dev分支并拉取源仓库dev分支上的内容
git checkout -b dev
git pull upstream dev
```

安装依赖

```
mvn package
```

#### 1.2、协作方式-1

要开发某个模块的时候，在你的本地仓库创建一个分支，例如mydev。

```
git checkout -b mydev
```

切换之后你的本地仓库上就有3个分支了，如下所示。checkout之后会自动切换到mydev分支。

```
├─master
├─dev
└─mydev
```

在mydev分支上进行开发和测试，完成相应的功能或者模块，完成之后再切回到dev分支将mydev的内容合并到dev。

```
# mydev分支上提交你的更新
git add *
git commit -m "add something"
# 切换到dev分支
git checkout dev
```

由于在你开发过程中，我也可能在开发并且更新了仓库，为了避免冲突，在合并分支之前你还需要更新你本地仓库的dev分支。先在本地仓库上添加上游仓库upstream，上游仓库即我的仓库，然后使用pull命令从上游仓库拉取更新。

```
# 拉取上游的源仓库dev分支上的更新
git pull upstream dev
```

更新完dev之后，将mydev分支合并到dev分支并提交到你自己的远程仓库。完成之后，mydev分支就可以删除了，你也可以继续留着。

```
# 将mydev分支合并到dev，可能会有冲突需要自行解决
git merge mydev
# 推送到你自己的远程仓库，注意这里是push到origin dev，不是upstream dev
git push origin dev
# 删除mydev分支
git branch -d mydev
```

推送到自己的远程仓库后，就可以到github上面给我发Pull Request了，然后等待我合并你的代码。

### 2. 项目结构

```

├── donate-server.iml
├── pom.xml
├── readme.md
├── src 项目源码
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── heu
│   │   │           └── donateserver
│   │   │               ├── DonateServerApplication.java
│   │   │               ├── common 
│   │   │               │   ├── CommonResponse.java
│   │   │               │   └── ResponseCode.java
│   │   │               ├── config 通用配置
│   │   │               │   └── Swagger2Config.java Swagger配置
│   │   │               ├── controller 网络接口层
│   │   │               │   ├── DonateClassController.java
│   │   │               │   ├── DonateController.java
│   │   │               │   ├── DonationClassAndOptionController.java
│   │   │               │   ├── DonationClassController.java
│   │   │               │   ├── DonationItemController.java
│   │   │               │   ├── DonationOptionController.java
│   │   │               │   └── DonationPersonController.java
│   │   │               ├── entity 实体层
│   │   │               │   ├── Donate.java
│   │   │               │   ├── DonationClass.java
│   │   │               │   ├── DonationClassAndOption.java
│   │   │               │   ├── DonationItem.java
│   │   │               │   ├── DonationOption.java
│   │   │               │   └── DonationPerson.java
│   │   │               ├── mapper 映射层
│   │   │               │   ├── DonateMapper.java
│   │   │               │   ├── DonateMapper.xml
│   │   │               │   ├── DonationClassAndOptionMapper.java
│   │   │               │   ├── DonationClassAndOptionMapper.xml
│   │   │               │   ├── DonationClassMapper.java
│   │   │               │   ├── DonationClassMapper.xml
│   │   │               │   ├── DonationItemMapper.java
│   │   │               │   ├── DonationItemMapper.xml
│   │   │               │   ├── DonationOptionMapper.java
│   │   │               │   ├── DonationOptionMapper.xml
│   │   │               │   ├── DonationPersonMapper.java
│   │   │               │   └── DonationPersonMapper.xml
│   │   │               ├── service 服务层
│   │   │               │   ├── DonationClassService.java
│   │   │               │   ├── IDonateService.java
│   │   │               │   ├── IDonationClassAndOptionService.java
│   │   │               │   ├── IDonationClassService.java
│   │   │               │   ├── IDonationItemService.java
│   │   │               │   ├── IDonationOptionService.java
│   │   │               │   ├── IDonationPersonService.java
│   │   │               │   └── impl
│   │   │               │       ├── DonateServiceImpl.java
│   │   │               │       ├── DonationClassAndOptionServiceImpl.java
│   │   │               │       ├── DonationClassServiceImpl.java
│   │   │               │       ├── DonationItemServiceImpl.java
│   │   │               │       ├── DonationOptionServiceImpl.java
│   │   │               │       └── DonationPersonServiceImpl.java
│   │   │               └── util 工具类
│   │   │                   └── BuildResponseUtils.java
│   │   └── resources
│   │       ├── application.yml
│   │       ├── static
│   │       └── templates
    └── test
        └── java
            └── com
               └── heu
                   └── donateserver
                       ├── DonateServerApplicationTests.java
                       └── GeneratorTest.java

```

### 3. 开发规范

#### 3.1 方法参数规范

无论是 `controller，service，manager，dao` 亦或是其他的代码，每个方法最多 `3` 个参数，如果超出 `3` 个参数的话，要封装成 `javabean` 对象。

#### Entity 包中的 javabean 命名规范

`javabean` 的整体要求：

- 不得有任何的业务逻辑或者计算
- 基本数据类型必须使用包装类型`（Integer, Double、Boolean 等）`
- 不允许有任何的默认值
- 每个属性必须添加注释，并且必须使用多行注释。
- 必须使用 `lombok` 简化 `getter/setter` 方法
- 建议对象使用 `lombok` 的 `@Builder ，@NoArgsConstructor`，同时使用这两个注解，简化对象构造方法以及set方法。