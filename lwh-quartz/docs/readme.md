# 任务调度

scheduler： 任务调度器        
trigger：触发器，用于定义任务调度时间规则        
job：任务，即被调度的任务      
misfire：错过的，指本来应该被执行但实际没有被执行的任务调度

## 目录结构

docs        
 docs/api Quartz 框架的JavaDoc Api 说明文档     
 docs/dbTables 创建 Quartz 的数据库对象的脚本       
 docs/wikidocs Quartz 的帮助文件，点击 index.html 开始查看       
Examples 多方面使用 Quartz 的例子       
Lib Quartz 使用到的第三方包         
 src/java/org/quartz 使用 Quartz 的客户端程序源代码，公有 API      
 src/java/org/quartz/core 使用 Quartz 的服务端程序源代码，私有 API         
 src/java/org/quartz/simpl Quartz 提供的不衣赖于第三方产品的简单实现      
 src/java/org/quartz/impl 依赖于第三方产品的支持模块的实现       
 src/java/org/quartz/utils 整个框架要用到的辅助类和工具组件      
 src/jboss 提供了特定于 JBoss 特性的源代码       
 src/oracle 提供了特定于 Oracle 特性的源代码         
 src/weblogic 提供了特定于 WebLogic 特性的源代码      
       
 