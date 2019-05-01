package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Sender {

	public static void main(String[] args) {
		String ip="localhost";
		int port=5000;
		
		DatagramSocket dgs=null;
		DatagramPacket dgp=null;
		try {
			InetAddress addr = InetAddress.getByName(ip);
			dgs=new DatagramSocket();
			String msg="Hello udp";
			dgp=new DatagramPacket(msg.getBytes()
					,msg.length(),addr,port);
			dgs.send(dgp);
			System.out.println(msg.length());
			msg="æ»≥Á«œººø‰";
			dgp=new DatagramPacket(
				msg.getBytes(), 10,addr,port);
			dgs.send(dgp);
			System.out.println(msg.length());
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			dgs.close();
		}

	}

}



















