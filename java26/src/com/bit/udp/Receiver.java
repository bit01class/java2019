package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {

	public static void main(String[] args) {
		byte[] buf=new byte[512];
		DatagramSocket dgs=null;
		DatagramPacket dgp=null;
		try {
			dgs=new DatagramSocket(5000);
			dgp=new DatagramPacket(buf, 5);
			
			dgs.receive(dgp);
			byte[] data = dgp.getData();
			System.out.println(new String(data));
			System.out.println("---------------");
			dgp=new DatagramPacket(buf, 32);
			
			dgs.receive(dgp);
			data = dgp.getData();
			System.out.println(new String(data));
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			dgs.close();
		}

	}

}


















