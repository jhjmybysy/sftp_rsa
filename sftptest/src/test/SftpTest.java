package test;

import java.io.File;

import com.jcraft.jsch.ChannelSftp;

import sftp.SftpUtil;

public class SftpTest {
	public static void main(String[] args) throws Exception {
		// String pathString = "C:\\test\\ccc\\Foxmail7.zip";
		// File file = new File(pathString);
		// System.out.println("上传文件开始...");
		// uploadFile(pathString, sftp);
		// System.out.println("上传成功，开始删除本地文件...");
		// file.delete();
		// System.out.println("删除完成，开始校验本地文件...");
		// if (!file.exists()) {
		// System.out.println("文件不存在，开始从远程服务器获取...");
		// download(pathString, pathString, sftp);
		// System.out.println("下载完成");
		// } else {
		// System.out.println("在本地找到文件");
		// }
		// rmDir("", sftp, true);

		// 密码登陆
		// ChannelSftp sftp = getSftpConnect ("10.0.0.100", 22, "ftpuser", "ftpuser");

		// 密钥登陆
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
