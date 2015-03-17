package foro

class Post {

    String topic
    Date dateCreated
    Date lastupdate
    boolean isAllowed

    public Post(){
        topic = ""
        dateCreated = new Date();
        lastupdate = new Date();
        isAllowed = false;
    }

    public Post(String topic,Date dateCreated,Date lastupdate,boolean isAllowed){
        this.topic=topic;
        this.dateCreated=dateCreated;
        this.lastupdate=lastupdate;
        this.isAllowed=isAllowed;
    }

    static constraints = {
    }

    String getTopic() {
        return topic
    }

    void setTopic(String topic) {
        this.topic = topic
    }

    Date getDateCreated() {
        return dateCreated
    }

    void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated
    }

    Date getLastupdate() {
        return lastupdate
    }

    void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate
    }

    boolean getIsAllowed() {
        return isAllowed
    }

    void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed
    }

    void comment(){

    }

    void rate(){

    }

    void share(){

    }
}