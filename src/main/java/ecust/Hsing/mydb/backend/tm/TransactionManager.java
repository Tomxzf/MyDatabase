package ecust.Hsing.mydb.backend.tm;

public interface TransactionManager {
    long begin(); //开启一个事务
    void commit(long xid); //提交一个事务

    void abort(long xid); //撤销一个事务

    boolean isActive(long xid); //判断事务是否开启
    boolean isCommited(long xid); //判断事务是否被提交
    boolean isAborted(long xid); //判断事务是否撤销

    void close();

}
