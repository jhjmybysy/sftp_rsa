package test;

import java.io.File;

import com.jcraft.jsch.ChannelSftp;

import sftp.SftpUtil;

public class SftpTest {
	public static void main(String[] args) throws Exception {
		// String pathString = "C:\\test\\ccc\\Foxmail7.zip";
		// File file = new File(pathString);
		// System.out.println("�ϴ��ļ���ʼ...");
		// uploadFile(pathString, sftp);
		// System.out.println("�ϴ��ɹ�����ʼɾ�������ļ�...");
		// file.delete();
		// System.out.println("ɾ����ɣ���ʼУ�鱾���ļ�...");
		// if (!file.exists()) {
		// System.out.println("�ļ������ڣ���ʼ��Զ�̷�������ȡ...");
		// download(pathString, pathString, sftp);
		// System.out.println("�������");
		// } else {
		// System.out.println("�ڱ����ҵ��ļ�");
		// }
		// rmDir("", sftp, true);

		// �����½
		// ChannelSftp sftp = getSftpConnect ("10.0.0.100", 22, "ftpuser", "ftpuser");

		// ��Կ��½
		String path0 = "E:\\VM\\id_rsa";
		ChannelSftp sftp = SftpUtil.getSftpConnect4Key("10.0.0.100", 22, "root", path0, "123456");
		String path1 = "/home/ftpuser/www/images/hello.jpg";
		String path2 = "E:\\hello.jpg";
		File file = SftpUtil.download(path1, path2, sftp);
		// SftpUtil.exit(sftp);
		SftpUtil.exit(sftp);
		System.exit(0);
	}
}
