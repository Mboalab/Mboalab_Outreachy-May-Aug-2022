package com.startapp.common.a;
import android.content.Context;
import com.startapp.common.a.h;
import com.startapp.common.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class f {
    public static <T> T a(Context context, String string, Class<T> class_) {
        return f.a(context, null, string, class_);
    }

    public static <T> T a(Context context, String string, String string2, Class<T> class_) {
        block6 : {
            if (string2 == null) {
                h.a(3, "readFromDisk::fileName is null");
                return null;
            }
            try {
                File file = new File(f.b(context, string));
                if (file.exists() && file.isDirectory()) {
                    File file2 = new File(file, string2);
                    if (file2.exists()) {
                        StringBuilder stringBuilder = new StringBuilder("Reading file: ");
                        stringBuilder.append(file2.getPath());
                        h.a("FileUtils", 4, stringBuilder.toString());
                        return f.b(file2);
                    }
                    break block6;
                }
                h.a("FileUtils", 3, "Files directory does not exist or not a directory");
            }
            catch (Error error) {
                StringBuilder stringBuilder = new StringBuilder("Failed to read from disk: ");
                stringBuilder.append(error.getLocalizedMessage());
                h.a("FileUtils", 6, stringBuilder.toString());
                return null;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder("Failed to read from disk: ");
                stringBuilder.append(exception.getLocalizedMessage());
                h.a("FileUtils", 6, stringBuilder.toString());
            }
            return null;
        }
        return null;
    }

    public static void a(Context context, String string) {
        if (string == null) {
            h.a(3, "deleteDirectory::dirPath == null");
            return;
        }
        f.a(new File(f.b(context, string)));
    }

    public static void a(Context context, String string, Serializable serializable) {
        f.a(context, null, string, serializable);
    }

    public static void a(Context context, String string, String string2, Serializable serializable) {
        if (string2 == null) {
            h.a("FileUtils", 3, "writeToDisk: fileName is null");
            return;
        }
        try {
            File file = new File(f.b(context, string));
            if (!file.exists() && !file.mkdirs()) {
                h.a("FileUtils", 3, "Unable to create directories");
                return;
            }
            File file2 = new File(file, string2);
            StringBuilder stringBuilder = new StringBuilder("Writing file: ");
            stringBuilder.append(file2.getPath());
            h.a("FileUtils", 4, stringBuilder.toString());
            f.a(serializable, file2);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Failed writing to disk: ");
            stringBuilder.append(exception.getLocalizedMessage());
            h.a("FileUtils", 3, stringBuilder.toString());
            return;
        }
    }

    private static void a(File file) {
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            int n2 = arrfile.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                f.a(arrfile[i2]);
            }
        }
        file.delete();
    }

    private static void a(Serializable serializable, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)fileOutputStream);
        objectOutputStream.writeObject((Object)serializable);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    private static <T> T b(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream((InputStream)fileInputStream);
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return (T)object;
    }

    private static String b(Context context, String string) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir().toString());
        if (string != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(File.separator);
            stringBuilder2.append(string);
            string2 = stringBuilder2.toString();
        } else {
            string2 = "";
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static <T> List<T> b(Context context, String string, Class<T> class_) {
        ArrayList arrayList;
        block9 : {
            block7 : {
                File file;
                String[] arrstring;
                block8 : {
                    arrayList = new ArrayList();
                    file = new File(f.b(context, string));
                    if (!file.exists() || !file.isDirectory()) break block7;
                    arrstring = file.list();
                    if (arrstring != null) break block8;
                    h.a("FileUtils", 3, "Files directory is empty");
                    return null;
                }
                int n2 = arrstring.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    File file2 = new File(file, arrstring[i2]);
                    StringBuilder stringBuilder = new StringBuilder("Reading file: ");
                    stringBuilder.append(file2.getPath());
                    h.a("FileUtils", 4, stringBuilder.toString());
                    arrayList.add(f.b(file2));
                }
                break block9;
            }
            try {
                h.a("FileUtils", 3, "Files directory does not exist or not a directory: ".concat(String.valueOf((Object)string)));
                return null;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder("Failed to read from disk: ");
                stringBuilder.append(exception.getLocalizedMessage());
                h.a("FileUtils", 6, stringBuilder.toString());
            }
        }
        return arrayList;
    }

    public static void b(final Context context, final String string, final Serializable serializable) {
        g.a(g.a.a, new Runnable(){

            public final void run() {
                f.a(context, null, string, serializable);
            }
        });
    }

}

