package com.pm.ch2i9;

import java.io.*;

public class Ugly {
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[1024];
                int n;
                while ((n = in.read(buf)) >= 0) out.write(buf, 0, n);
            }
            finally {
                out.close();
            }
            } finally {
                in.close();
            }
        }
}