package ecust.Hsing.mydb.backend.tm;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;

public class TransactionManagerImpl {
    static final int LEN_XID_HEADER_LENGTH = 8;
    private static final int XID_FIELD_SIZE = 1;
    private static final byte FIELD_TRAN_ACTIVE   = 0;
    private static final byte FIELD_TRAN_COMMITTED = 1;
    private static final byte FIELD_TRAN_ABORTED  = 2;
    public static final long SUPER_XID = 0;
    // XID 文件后缀
    static final String XID_SUFFIX = ".xid";

    private RandomAccessFile file;
    private FileChannel fc;
    private long xidCounter;
    private Lock counterLock;

    private void checkXIDCounter(){
        long fileLen = 0;
        try {
            fileLen = file.length();
        }catch (IOException e1) {
            Panic.panic(Error.BadXIDFileException);
        }

    }
}
