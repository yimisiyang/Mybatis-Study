## 2021-08-22

### 1.mybatis-01 模块

实现mysql增删改查功能。

### 2.mybatis-02 模块

#### 2.1 环境配置（environments）

MyBatis 可以配置适应多种环境

**不过要记住：尽管可以配置多个环境，但每个SqlSessionFactory实例只能选择一种环境**

Mybatis默认的事务管理器是jdbc,连接池：POOLED

#### 2.2 属性（properties）

我们可以通过properties 属性实现引用配置文件

这些属性可以在外部进行配置，并可以进行动态替换。你既可以在典型的 Java 属性文件中配置这些属性，也可以在 properties 元素的子元素中设置。

#### 2.3 类型别名（typeAliases）

当使用实体类的包时，默认别名为就为这个类名的首字母小写；可以通过在实体类上增加注解的方式修改别名。

#### 2.4 设置（settings）



#### 2.5 映射器（mappers）



#### 2.6 生命周期和作用域

生命周期和作用域是至关重要的，因为错误的使用会导致严重的并发问题。

**SqlSessionFactoryBulider**

- 一旦创建了SqlSessionFactory，就不再需要它了
- 局部变量

**SqlSessionFactory**

- 数据库连接池
- 一旦创建就应该在应用的运行期间一直存在，没有任何理由丢弃它或重新创建另一个实例。
- 因此SqlSessionFactory的作用域就是应用作用域
- 最简单的就是使用单例模式或静态单例模式

**SqlSession**

- 连接到连接池的一个请求
- 关闭请求，不是线程安全的，不能被共享，用完后关闭。



### 3. 结果集映射

目的：解决实体类与数据库字段名称不一致的问题。

解决上述问题两种方法：

- 通过select 语句起别名的方式
- 通过 resultMap结果集映射的方式

```xml
<resultMap id="UserMap" type="User">
  <id property="id" column="user_id" />
  <result property="username" column="user_name"/>
  <result property="password" column="hashed_password"/>
</resultMap>
<select id="getUserById" resultMap="UserMap">
	select * from mybaties.t_user where id = #{id}
</select>
```

### 4. 日志工厂

logimpl指定 mybatis所有日志的具体实现，未指定时将会自动查找

- SLF4J 
- LOG4J 【掌握】
- LOG4J2 
-  JDK_LOGGING
-  COMMONS_LOGGING 
-  STDOUT_LOGGING【掌握】
-  NO_LOGGING 

在mybatis中具体使用什么日志实现，由设置中指定。（在mybatis的核心配置文件中配置）

