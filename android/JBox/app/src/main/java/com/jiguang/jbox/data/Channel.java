package com.jiguang.jbox.data;

import android.content.Context;

import com.jiguang.jbox.AppApplication;

import java.util.List;
import java.util.Stack;
import java.util.UUID;

public class Channel {

    private String mId;

    private final String mName;

    private String mIconPath;

    private String mDescription;

    private String mDevKey;

    private String mDevName;

    private int unReadMessageCount; // 未读消息数。

    private Stack<Message> mMessages;

    private Developer mDeveloper;

    private boolean isSubscribe;

    public Channel(String name) {
        mId = UUID.randomUUID().toString();
        mName = name;
    }

    public Channel(String id, String name) {
        mId = id;
        mName = name;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public Message getLatestMessage() {
        return mMessages.pop();
    }

    public int getUnReadMessageCount() {
        return unReadMessageCount;
    }

    public void setUnReadMessageCount(int unReadMessageCount) {
        this.unReadMessageCount = unReadMessageCount;
    }

    public List<Message> getMessages() {
        return mMessages;
    }

    public void setMessages(Stack<Message> messages) {
        mMessages = messages;
    }

    public String getDevKey() {
        return mDevKey;
    }

    public void setDevKey(String devKey) {
        mDevKey = devKey;
    }

    public Developer getDeveloper() {
        return mDeveloper;
    }

    public void setDeveloper(Developer developer) {
        mDeveloper = developer;
    }

    public boolean isSubscribe() {
        return isSubscribe;
    }

    public void setSubscribe(boolean subscribe) {
        isSubscribe = subscribe;
    }

    /**
     * 订阅 Channel
     */
    public void subscribe(Context context) {

    }

    /**
     * 取消订阅
     */
    public void unSubscribe() {

    }

    public String getTag() {
        return AppApplication.getAppKey() + mName;
    }

    public String getIconPath() {
        return mIconPath;
    }

    public void setIconPath(String iconPath) {
        this.mIconPath = iconPath;
    }

    public String getDevName() {
        return mDevName;
    }

    public void setDevName(String devName) {
        mDevName = devName;
    }
}
