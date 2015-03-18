package foro
// John Ubaldo Hernández :v

class Regular extends User{
    int postViews;
    int strikesNumber;
    int starsNumber;

    public Regular(int postViews, int strikesNumber, starsNumber) {
        this.postViews = postViews;
        this.strikesNumber = strikesNumber;
        this.starsNumber = starsNumber;
    }

    // getters
    public int getPostViews(){
        return postViews;
    }
    public int getStrikesNumber(){
        return strikesNumber
    }
    public int getStarsNumber(){
        return starsNumber;
    }

    //setters

    public void setPostViews(int postViews){
        this.postViews = postViews;
    }
    public void setStrikesNumber(int strikesNumber){
        this.strikesNumber = strikesNumber;
    }
    public void setStarsNumber(int starsNumber){
        this.starsNumber = starsNumber;
    }
    static constraints = {
    }
}
