import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class HelloXclassLoader extends ClassLoader {
    public static void main(String[] args) {
        try {
            Class<?> hellloClass =  new HelloXclassLoader().findClass("Hello");
            hellloClass.getMethod("hello").invoke(hellloClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String xClassPath = "E:\\IdeaProjects\\untitled\\src\\Hello.xlass";
        File file = new File(xClassPath);
        try {
            InputStream is = new FileInputStream(file);

            int len = is.available();
            byte[] b = new byte[len];
            is.read(b, 0, len);
            for (int i = 0; i < b.length; ++i) {
                b[i] = (byte) (255 - b[i]);
            }
            return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
