package Creational.SingleTon;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK1.5 起
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 getInstance() 的性能对应用程序很关键。
 * Created by zero on 15-8-28.
 */
public class SingleTonFour {
    //各线程可见
    private static volatile SingleTonFour singleTonFour;
    private SingleTonFour(){

    }

    public static SingleTonFour getInstance() {
        if (singleTonFour == null) {

            //锁住对象，多线程安全
            synchronized (SingleTonFour.class) {
                if (singleTonFour == null) {
                    singleTonFour = new SingleTonFour();
                }
            }
        }
        return singleTonFour;
    }
}
