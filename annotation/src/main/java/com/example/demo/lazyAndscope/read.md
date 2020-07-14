默认情况下 spring 容器中都是单实例。
@Lazy注解
value=false：默认在容器启动的时候创建对象
value=true：懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化　　
@Scope注解
prototype：多例。IOC容器启动并不会去调用方法创建对象放在容器中。每次获取的时候才会调用方法创建对象；
singleton：单例。IOC容器启动会调用方法创建对象放到ioc容器中。 以后每次获取是直接从容器（map.get()）中拿,全局有且仅有一个实例　
https://www.cnblogs.com/jiang27/p/12551727.html