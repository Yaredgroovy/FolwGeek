package com.cn.goldenjobs.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table HISTORY.
 */
public class History {

    private Long id;
    private String msgId;
    private Long msgTime;
    private String msgBody;
    private Integer msgType;
    private Integer groupId;
    private String msgFrom;
    private Integer msgStatus;
    private Boolean isAcked;
    private Boolean isDelivered;
    private String msgToken;

    public History() {
    }

    public History(Long id) {
        this.id = id;
    }

    public History(Long id, String msgId, Long msgTime, String msgBody, Integer msgType, Integer groupId, String msgFrom, Integer msgStatus, Boolean isAcked, Boolean isDelivered, String msgToken) {
        this.id = id;
        this.msgId = msgId;
        this.msgTime = msgTime;
        this.msgBody = msgBody;
        this.msgType = msgType;
        this.groupId = groupId;
        this.msgFrom = msgFrom;
        this.msgStatus = msgStatus;
        this.isAcked = isAcked;
        this.isDelivered = isDelivered;
        this.msgToken = msgToken;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Long getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Long msgTime) {
        this.msgTime = msgTime;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getMsgFrom() {
        return msgFrom;
    }

    public void setMsgFrom(String msgFrom) {
        this.msgFrom = msgFrom;
    }

    public Integer getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(Integer msgStatus) {
        this.msgStatus = msgStatus;
    }

    public Boolean getIsAcked() {
        return isAcked;
    }

    public void setIsAcked(Boolean isAcked) {
        this.isAcked = isAcked;
    }

    public Boolean getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(Boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public String getMsgToken() {
        return msgToken;
    }

    public void setMsgToken(String msgToken) {
        this.msgToken = msgToken;
    }

}