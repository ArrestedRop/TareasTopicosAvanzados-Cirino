package Tarea23;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDirectoryExample {
    private final List<String> fileList = new ArrayList<>();

    public static void main(String[] args) {
        String dir = "C:/Users/villa/OneDrive/Documentos/GitHub/TareasTopicosAvanzados-Cirino";
        String zipFile = "C:/Users/villa/OneDrive/Documentos/Pureba";

        ZipDirectoryExample zip = new ZipDirectoryExample();
        zip.compressDirectory(dir, zipFile);
    }

    private void compressDirectory(String dir, String zipFile) {
        File directory = new File(dir);
        getFileList(directory);

        try (FileOutputStream fos = new FileOutputStream(zipFile);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            for (String filePath : fileList) {
                System.out.println("Compressing: " + filePath);

                // Creates a zip entry.
                String name = filePath.substring(directory.getAbsolutePath().length() + 1);

                ZipEntry zipEntry = new ZipEntry(name);
                zos.putNextEntry(zipEntry);

                // Read file content and write to zip output stream.
                try (FileInputStream fis = new FileInputStream(filePath)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        zos.write(buffer, 0, length);
                    }

                    // Close the zip entry.
                    zos.closeEntry();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get files list from the directory recursive to the subdirectory.
     */
    private void getFileList(File directory) {
        File[] files = directory.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file.getAbsolutePath());
                } else {
                    getFileList(file);
                }
            }
        }

    }
}