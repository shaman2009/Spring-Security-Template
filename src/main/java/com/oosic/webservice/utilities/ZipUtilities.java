package com.oosic.webservice.utilities;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipUtilities {
	private static final String COULDT_MAKE_DIR = "Couldn't make directory: ";

	private static final int BUFFER_SIZE = 4096;

	public static void unzip(InputStream input, String unZipDir)
			throws IOException {
		File d = new File(unZipDir);
		if (!d.exists())
			if (!d.mkdir()) {
				String msg = COULDT_MAKE_DIR + unZipDir;
				throw new IOException(msg);
			}

		ZipInputStream zis = new ZipInputStream(input);
		ZipEntry entry;
		BufferedOutputStream dest = null;
		while ((entry = zis.getNextEntry()) != null) {
			System.out.println("Extracting: " + entry);
			String fileName = unZipDir + "/" + entry.getName();
			if (entry.getName().endsWith("/")) {
				File f = new File(fileName);
				if (!f.mkdir()) {
					String msg = COULDT_MAKE_DIR + fileName;
					throw new IOException(msg);
				}
			} else {
				byte data[] = new byte[BUFFER_SIZE];
				FileOutputStream fos = new FileOutputStream(fileName);
				int count;
				dest = new BufferedOutputStream(fos, BUFFER_SIZE);
				while ((count = zis.read(data, 0, BUFFER_SIZE)) != -1) {
					dest.write(data, 0, count);
				}
				dest.flush();
				dest.close();
			}
		}
	}

	public static boolean makeCleanDir(String unZipDir) {
		boolean b = false;
		File f = new File(unZipDir);
		if (!f.exists()) {
			b = f.mkdirs();
		} else {
			cleanDir(f);
		}
		return b;
	}

	public static void cleanDir(File file) {
		if (file.exists()) {
			if (file.isFile()) {
				file.delete();
			} else if (file.isDirectory()) {
				File files[] = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					cleanDir(files[i]);
				}
			}
		}
	}
}
