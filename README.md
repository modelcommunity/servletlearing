# servletlearing
小刘同学学习servlet
三大作用域的使用,其本质是根据作用域的范围,生命周期决定其使用的方式.：

request:每一次请求都是一个新的request对象，如果在Web组件之间需要共享同一个请求中的数据，只能使用请求转发。
session：每一次会话都是一个新的session对象，如果需要在一次会话中的多个请求之间需要共享数据，只能使用session。
application：应用对象，Tomcat 启动到关闭，表示一个应用，在一个应用中有且只有一个application对象，作用于整个Web应用，可以实现多次会话之间的数据共享。

三个作用域通用方法
存放数据：setAttribute(name,value)

获取数据：getAttribute(name);

删除数据：removeAttribute(name);


application（ServletContext）
作用域
application：应用对象，服务器启动到关闭，表示一个应用。在一个应用中有且只有一个application对象，作用于整个Web应用，可以实现多次会话之间的数据共享。

生命周期
创建：服务器启动时为每一个项目创建一个上下文对象（ServletContext）
销毁：服务器关闭的时候 或者项目移除的时候

session（HttpSession）
作用域
生命周期
创建 : 第一次调用 request.getsession()

html: 不会
jsp: 会 getSession();
servlet: 会

销毁 :

默认30分钟以后
服务器关闭的时候
session.invalidate() 手动销毁
request（HttpServletRequest）
作用域
每一次请求都是一个新的request对象，如果在Web组件之间需要共享同一个请求中的数据，只能使用请求转发。

生命周期
创建 : 请求开始的时候创建(访问服务器资源)。

访问 html： 会
访问 jsp: 会
访问 servlet : 会

销毁 : 响应开始的时候(资源请求结束)。