package chattingServer;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class KafkaWebSocketServer extends WebSocketServer{
	List<WebSocket> connections = new ArrayList<WebSocket>();
	
	public KafkaWebSocketServer(InetSocketAddress address) {
		super(address);
	}
	public static void main(String[] args) {
		InetSocketAddress address = new InetSocketAddress("172.16.110.46", 1234);
		KafkaWebSocketServer server = new KafkaWebSocketServer(address);
		server.start();
	}
	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {
		System.out.println("New connection: " + conn.getRemoteSocketAddress());
		conn.send("Welcome to the WebSocket server!");	
		connections.add(conn);
	}
	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		System.out.println("Closed connection: " + conn.getRemoteSocketAddress());
		connections.remove(conn);	
	}
	@Override
	public void onMessage(WebSocket conn, String message) {
		System.out.println("Message from client: " + message);
		broadcastMessage(message, conn);
	}
	@Override
	public void onError(WebSocket conn, Exception ex) {
		ex.printStackTrace();
	}
	@Override
	public void onStart() {
		System.out.println("WebSocket Server started successfully.");		
	}
	public void broadcastMessage(String message, WebSocket conn) {
		for(WebSocket connection : connections) {
			if(connection != conn) {
				connection.send(conn.getRemoteSocketAddress() + ": " + message);
			}
		}
	}
	public void startKafkaConsumer(WebSocket conn, String message) {
		
	}
}






