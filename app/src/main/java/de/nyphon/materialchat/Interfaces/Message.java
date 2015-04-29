package de.nyphon.materialchat.Interfaces;

import java.util.Date;

public class Message {
    private int ID;
    private String Content;
    private String Sender;
    private Date Time;
    private MessageStatus Status;

    public Message(int id, String content, String sender, Date time, MessageStatus status) {
        this.ID = id;
        this.Content = content;
        this.Sender = sender;
        this.Time = time;
        this.Status = status;
    }

    public int getID() {
        return this.ID;
    }

    public String getContent() {
        return this.Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public String getSender() {
        return this.Sender;
    }

    public Date getTime() {
        return this.Time;
    }

    public MessageStatus getStatus() {
        return this.Status;
    }

    public void setStatus(MessageStatus status) {
        this.Status = status;
    }
}
