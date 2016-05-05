package ro.ubbcluj.scs;

public class FakeFileManager implements FileManager {

    public static final String FILE_EXTENSION = "log";

    public String getLogNameExt() {
        return FILE_EXTENSION;
    }

}
