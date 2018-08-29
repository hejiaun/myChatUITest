package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.administrator.myapplication.entity.MyMessage;

import java.util.ArrayList;

import cn.jiguang.imui.commons.models.IMessage;
import cn.jiguang.imui.messages.MessageList;
import cn.jiguang.imui.messages.MsgListAdapter;

public class MainActivity extends AppCompatActivity {

    private MessageList messageList;
    private MsgListAdapter msgListAdapter;
    private ArrayList<MyMessage> myMessages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageList = (MessageList) findViewById(R.id.ml);
        msgListAdapter = new MsgListAdapter("0", new MyHolderConfig(), new MyImageLoader());
        messageList.setAdapter(msgListAdapter);
        for (int i = 0; i < 20; i++) {
            myMessages.add(new MyMessage("dddd", IMessage.MessageType.SEND_TEXT.ordinal()));
        }
        msgListAdapter.addToEndChronologically(myMessages);
        Log.d("dd", "ddddd");
    }
}
