package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

// 클라이언트의 정보를 받고 서버에게 보내줌
public class UserSocket extends Thread {

	public String userName;
	private boolean isRun = true;

	private String myCunnectRoomName;
	private String protocol;
	private String message;
	private String textReader;

	Server mContext;
	Socket socket;

	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;

	public UserSocket(Socket socket, Server server) {
		this.socket = socket;
		this.mContext = server;

		initData();
	}

	private void initData() {
		try {

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			userName = bufferedReader.readLine();
			System.out.println(" 『 " + userName + " 』  님이 입장하셨습니다." + "\n"+"\n");
			
			
			mContext.broadcast("NewUser/" + userName);
			
			for (int i = 0; i < mContext.users.size(); i++) {
				UserSocket us = mContext.users.get(i);
				sendMessage("OldUser/" + us.userName);
				System.out.println("OldUser/" + us.userName);
				System.out.println("------------------------------");
			}

			mContext.users.add(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg) {
		try {
			bufferedWriter.write(msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		new Thread(() -> {

			while (isRun) {
				try {
					String msg = bufferedReader.readLine();
					// 서버기능 방송 ---> 서버 홍길동, 이순신, 티모
					inMessage(msg);
					// mContext.broadcast(msg);
					// 메세지 넘겨 받는 부분
				} catch (IOException e) {
					isRun = false;
					e.printStackTrace();
				}

			}

		}).start();
	}

	private void inMessage(String msg) {
		StringTokenizer st = new StringTokenizer(msg, "/");

		String protocol = st.nextToken();
		String message = st.nextToken();

		System.out.println("protocol : " + protocol);
		System.out.println("message : " + message);

		if (protocol.equals("chat")) {
			System.out.println("usersocket : in message");
			// 같은방에 존재하난 사람을 찾아서 UserSocket 에 있는 sendMessage
			mContext.broadcast(msg);
			System.out.println("msg :: " + msg);
		} else if (protocol.equals("roomIn")) {
			//
		}
	}

	private final String CREATEROOM = "CREATEROOM";

	private void createRoom() {
	}

//	private void connectUser() {
//		try {
//			userName = bufferedReader.readLine();
//			System.out.println(userName + " 입장 ");
//			
//			mContext.broadcast("신규유저 " + userName);
//			
//			mContext.users.add(this);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	class RoomInfomation {

		String roomName;
		Vector<UserSocket> rooms = new Vector<>();

		public RoomInfomation(String roomName, UserSocket user) {
			this.roomName = roomName;
			this.rooms.add(user);
			user.myCunnectRoomName = roomName;
		}

		private void roomBroadcast(String str) {
			for (int i = 0; i < rooms.size(); i++) {
				UserSocket user = rooms.elementAt(i);
				user.sendMessage(str);
			}
		}

		private void addUser(UserSocket user) {
			rooms.add(user);
		}

	}

}
