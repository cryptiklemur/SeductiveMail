package com.seductivecraft;

/**
 * Created with IntelliJ IDEA.
 * User: Blood
 * Date: 7/31/12
 * Time: 12:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class message {
    private String to;
    private String from;
    private String message;
    private int[] items;

    public message(String to, String from, String message, int[] items) {
        this.to = to;
        this.from = from;
        this.message = message;
        this.items = items;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }
}
