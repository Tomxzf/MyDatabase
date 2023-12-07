# MyDatabase
## 整体结构
整体结构分为前端和后端，前端功能单一，即将用户输入的sql语句传输到后台并执行。
后端又分为五个模块，进行sql语句的执行
### Transaction Manager
通过维护xid文件来管理事务的状态，并提供相关接口供其他模块进行查询。
在 MYDB 中，每一个事务都有一个 XID，这个 ID 唯一标识了这个事务。事务的 XID 从 1 开始标号，并自增，不可重复。并特殊规定 XID 0 是一个超级事务（Super Transaction）。当一些操作想在没有申请事务的情况下进行，那么可以将操作的 XID 设置为 0。XID 为 0 的事务的状态永远是 committed。




### Data Manager
抽象类AbstractCache，有这些属性：实际缓存的数据，元素的引用个数，正在获取某资源的线程，数据的数量，缓存的最大资源数。Lock 接口是用于控制多线程对共享资源进行访问的机制之一。Lock 提供了比传统的synchronized 关键字更灵活的方式来进行线程同步。
主要的实现类之一是 ReentrantLock，它实现了 Lock 接口。ReentrantLock 是可重入的锁，允许线程重复获取同一个锁，这对于一些复杂的同步场景非常有用。



