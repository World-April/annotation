@AutoConfigureAfter：一个配置类在另一个配置类之后加载
@AutoConfigureBefore：一个配置类在另一个配置类之前加载
示例中通过更换B类中的注解，可以看到A和B加载的顺序
注意：一定要配置resources目录下创建META-INF目录下创建 spring.factories 文件