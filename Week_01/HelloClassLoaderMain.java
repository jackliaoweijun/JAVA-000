public class HelloClassLoaderMain {
    public static void main(String[] args) {
        String path = "E:/IdeaProjects/untitled/src";
        HelloClassLoader helloClassLoader = new HelloClassLoader(path);
        String className = "Hello";
        try {
            Class hello = helloClassLoader.findClass(className);
            System.out.println(hello.getClassLoader().getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
