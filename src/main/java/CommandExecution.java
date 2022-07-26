public class CommandExecution {

    static {
        System.loadLibrary("libcmd");
    }

    public static native String exec(String cmd);

    public static void main(String[] args) {
        System.out.println(exec("pwd"));
    }
}
