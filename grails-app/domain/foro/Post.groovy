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
}