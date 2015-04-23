package de.nyphon.materialchat.Modules;

import android.app.IntentService;
import android.content.Intent;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Ralph Schuler on 21.04.2015.
 */
public class AppService extends IntentService {

    private WebSocketClient mWebSocketClient;

    public AppService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            mWebSocketClient = new WebSocketClient(new URI("ws://52.17.85.63:8080"), new Draft_10()) {
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

                }
            };

            mWebSocketClient.run();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
