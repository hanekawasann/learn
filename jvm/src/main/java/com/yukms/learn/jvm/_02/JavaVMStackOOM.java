package com.yukms.learn.jvm._02;

/**
 * VM Args: -Xss2M
 *
 * java.lang.OutOfMemoryError: unable to create new native thread
 *
 * @author yukms 763803382@qq.com 2019/5/6 18:52
 */
public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {}
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    /**
     * 别运行会卡死
     */
    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
