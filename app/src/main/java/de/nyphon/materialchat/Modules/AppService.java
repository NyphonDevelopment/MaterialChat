package de.nyphon.materialchat.Modules;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Ralph Schuler on 21.04.2015.
 */
public class AppService extends IntentService {

    private WebSocketClient mWebSocketClient;

    public AppService() {
        super("AppService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        URI uri;
        try {
            uri = new URI("ws://192.168.2.108:8080");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return;
        }

        mWebSocketClient = new WebSocketClient(uri) {
            @Override
            public void onOpen(ServerHandshake serverHandshake) {

            }

            @Override
            public void onMessage(String s) {

            }

            @Override
            public void onClose(int i, String s, boolean b) {

            }

            @Override
            public void onError(Exception e) {
                Log.i("Websocket", "Error " + e.getMessage());
            }
        };

        mWebSocketClient.connect();
    }
}
