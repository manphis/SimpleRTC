package com.example.simplertc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.appspot.apprtc.PeerConnectionClient;


public class MainActivity extends AppCompatActivity implements PeerConnectionClient.PeerConnectionEvents {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLocalDescription(org.webrtc.SessionDescription sdp) {

    }

    @Override
    public void onIceCandidate(org.webrtc.IceCandidate candidate) {

    }

    @Override
    public void onIceCandidatesRemoved(org.webrtc.IceCandidate[] candidates) {

    }

    @Override
    public void onIceConnected() {

    }

    @Override
    public void onIceDisconnected() {

    }

    @Override
    public void onPeerConnectionClosed() {

    }

    @Override
    public void onPeerConnectionError(String description) {

    }

    @Override
    public void onPeerConnectionStatsReady(org.webrtc.StatsReport[] reports) {

    }
}
