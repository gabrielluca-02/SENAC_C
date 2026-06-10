import java.io.IOException;
import java.io.Writer;

public static void sc_putstr_fd(String str, Writer writer)
        throws IOException {

    if (str == null) {
        return;
    }

    writer.write(str);
}