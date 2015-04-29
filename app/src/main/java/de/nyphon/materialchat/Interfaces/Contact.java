package de.nyphon.materialchat.Interfaces;

/**
 * Created by Ralph Schuler on 27.04.2015.
 */
public class Contact {
    private int ID;
    private String Name;
    private String Number;
    private String StatusMessage;
    private String AvatarPath;
    private ContactStatus Status;

    public Contact(int id, String name, String number, String statusMessage, String avatarPath, ContactStatus status) {
        this.ID = id;
        this.Name = name;
        this.StatusMessage = statusMessage;
        this.AvatarPath = avatarPath;
        this.Status = status;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getNumber() {
        return this.Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public String getStatusMessage() {
        return this.StatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.StatusMessage = statusMessage;
    }

    public String getAvatarPath() {
        return this.AvatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.AvatarPath = avatarPath;
    }

    public ContactStatus getStatus() {
        return this.Status;
    }

    public void setStatus(ContactStatus status) {
        this.Status = status;
    }
}
