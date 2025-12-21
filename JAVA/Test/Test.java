import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        String javaHome = System.getProperty("java.home");
        File lib = new File(javaHome + "/lib");
        File rtJar = null;

        // For old Java versions (rt.jar)
        for (File f : lib.listFiles()) {
            if (f.getName().equals("rt.jar")) {
                rtJar = f;
                break;
            }
        }

        if (rtJar == null) {
            System.out.println("rt.jar not found (Java 9+ uses modules)");
            return;
        }

        List<String> exceptions = new ArrayList<>();

        try (java.util.jar.JarFile jar = new java.util.jar.JarFile(rtJar)) {
            jar.stream().forEach(entry -> {
                String name = entry.getName();
                if (name.endsWith(".class") && name.contains("Exception")) {
                    exceptions.add(name.replace("/", ".").replace(".class", ""));
                }
            });
        }

        System.out.println("Total exceptions in Java: " + exceptions.size());
        exceptions.forEach(System.out::println);
    }
}
