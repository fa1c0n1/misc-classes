import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSEngineTest {

    @Test
    public void testJS_1() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        if (engine == null) {
            System.out.println("No JavaScript engine found");
            return;
        }

        // 执行系统命令
        engine.eval("var command = 'ls -l';" +
                "var process = java.lang.Runtime.getRuntime().exec(command);" +
                "process.waitFor();" +
                "var exitValue = process.exitValue();" +
                "print('Exit value: ' + exitValue);");
    }

    @Test
    public void testJS_2() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        if (engine == null) {
            System.out.println("No JavaScript engine found");
            return;
        }

        // 执行系统命令
        engine.eval("var command = ['ls', '-l'];" +
                "var process = java.lang.Runtime.getRuntime().exec(command);" +
                "process.waitFor();" +
                "var exitValue = process.exitValue();" +
                "print('Exit value: ' + exitValue);");
    }


    @Test
    public void testJS_3() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        if (engine == null) {
            System.out.println("No JavaScript engine found");
            return;
        }

        // 执行系统命令
        // 执行系统命令
        engine.eval("var command = ['open', '-a', 'Calculator'];" +
                "var process = new java.lang.ProcessBuilder(command).start();" +
                "process.waitFor();" +
                "var exitValue = process.exitValue();" +
                "print('Exit value: ' + exitValue);");
    }

    /**
     * 将命令执行结果打印到控制台
     */
    @Test
    public void testJS_4() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        if (engine == null) {
            System.out.println("No JavaScript engine found");
            return;
        }

        // 执行系统命令
        engine.eval("var command = ['/bin/bash','-c','ls -lht;ps -ef |grep -i java;ifconfig |grep inet;cat /etc/passwd'];" +
                "var process = java.lang.Runtime.getRuntime().exec(command);" +
                "process.waitFor();" +
                "var inputStream = process.getInputStream();" +
                "var reader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));" +
                "var line;" +
                "while ((line = reader.readLine()) != null) {" +
                "    print(line);" +
                "}");
    }

    /**
     * 将命令执行结果传到Java对象.
     *   但，实战时，不太可能有机会让你往js执行上下文put一个java对象.
     *   所以个人认为这种方式并不实用.
     */
    @Test
    public void testJS_5() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        if (engine == null) {
            System.out.println("No JavaScript engine found");
            return;
        }

        // 创建一个StringBuilder对象来存储输出结果
        StringBuilder output = new StringBuilder();

        // 在JavaScript代码中定义output变量
        engine.put("output", output);

        // 执行系统命令并将输出存储到StringBuilder中
        engine.eval("var command = 'ls -l';" +
                "var process = java.lang.Runtime.getRuntime().exec(command);" +
                "process.waitFor();" +
                "var inputStream = process.getInputStream();" +
                "var reader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));" +
                "var line;" +
                "while ((line = reader.readLine()) != null) {" +
                "    output.append(line + '\\n');" +
                "}");

        // 将StringBuilder的内容转换为Java的String对象
        String result = output.toString();

        // 打印结果
        System.out.println(result);
    }
}