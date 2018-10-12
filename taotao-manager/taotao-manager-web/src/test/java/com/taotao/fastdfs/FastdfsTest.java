package com.taotao.fastdfs;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.m.fastdfs.common.MyException;
import com.m.fastdfs.sources.ClientGlobal;
import com.m.fastdfs.sources.StorageClient;
import com.m.fastdfs.sources.StorageServer;
import com.m.fastdfs.sources.TrackerClient;
import com.m.fastdfs.sources.TrackerServer;

public class FastdfsTest {
	
	@Test
	public void testUpload() throws FileNotFoundException, IOException, MyException {
		//初始化全局配置
		ClientGlobal.init("E:\\eclipse-workspace\\myWorkspace\\taotao-manager\\taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
		//创建一个TrackerClient
		TrackerClient trackerClient = new TrackerClient();
		
		TrackerServer trackerServer = trackerClient.getConnection();
		
		StorageServer storageServer = null;
		
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		String[] strings = storageClient.upload_file("C:\\Users\\Administrator\\Desktop\\img\\5ae2f1bbN8520b6b3.jpg", "jpg", null);
		
		for(String string : strings) {
			System.out.println(string);
		}
	}

	@Test
	public void testFastDfsClient() throws Exception {
		FastDFSClient client = new FastDFSClient("E:\\eclipse-workspace\\myWorkspace\\taotao-manager\\taotao-manager-web\\src\\\\main\\resources\\properties\\client.conf");
		String uploadFile = client.uploadFile("C:\\Users\\Administrator\\Desktop\\img\\5af017eaNc79183e2.jpg", "jpg");
		System.out.println(uploadFile);
		
	}
}
