# Spring-Specification-Example
通过客户的请求参数来构造Specification，类似动态拼接SQL文，但是能保证类型安全等。

同时可以三种返回值：
1）所有满足条件的记录
2）满足条件的一条记录
3）满足条件的条数

启动应用：
查询lastName为brooks，年龄大于25岁的用户：
http://localhost:8080/users?search=lastName:Brooks,age>25
