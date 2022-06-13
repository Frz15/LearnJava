package com.itheima.hello;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Udp_Message {
    public static void main(String[] args) {
        new Receive().start();
        new Send().start();
    }
}

class Receive extends Thread {
    public void run() {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(6666);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        while (true) {
            try {
                socket.receive(packet);  // 接货
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] arr = packet.getData();
            int len = packet.getLength();
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println(ip + ":" + port + ":" + new String(arr, 0, len));
        }
    }

}

class Send extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = null;   //创建码头
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (true) {
            String str = sc.nextLine();
            if ("quit".equals(str)) {
                break;
            }
            DatagramPacket packet = null;
            try {
                packet = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("166.111.50.194"), 10053);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            try {
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
