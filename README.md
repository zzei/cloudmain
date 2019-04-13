# cloudmain
  第一次创建SpringCloud工程
  父工程pom文件引用共用依赖
  api模块提供公共代码
  两个eureka-server，可以组成集群服务
  provide模块提供业务代码
  customer使用ribbon进行负载均衡
  
  ---20190410

  添加feign负载均衡模块，并集成hystrix实现服务降级
  （注意！开启feign.hystrix.enabled=true 必须写在application.properties里，yml里不生效）
  provide模块使用hystrix实现服务熔断
  
  ---20190412

  添加zuul网关模块gateway
  添加config配置模块，含config3344、eureka、provide
  customer-config模块在调用provide的时候，调用不成功，找不到provide，故暂时不做客户端的集成配置
  
  ---20190413
