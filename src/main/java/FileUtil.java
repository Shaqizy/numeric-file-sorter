import java.io.File;

class FileUtil {

    String getFile(String fileName){

        File file = new File(".." + File.separator +
                "numeric-file-sorter" + File.separator +
                "testfile" + File.separator + fileName);
        return file.getPath();
    }
}
