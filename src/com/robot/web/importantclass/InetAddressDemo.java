package com.robot.web.importantclass;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

public class InetAddressDemo {

	public static void main(String args[]){
		try {
			//使用域名创建对象
			InetAddress inet1=InetAddress.getByName("www.baidu.com");
			//根据IP创建对象
			InetAddress inet2=InetAddress.getByName("www.baidu.com");
			//获得本机地址对象
			InetAddress inet3=InetAddress.getLocalHost();
			
		
			for(int i=1;i<=3;i++){
				System.out.println();
			}
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
