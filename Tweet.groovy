@groovy.transform.ToString
class Tweet {

    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    public Tweet(String username, String text) {
        this.username = username
        this.text = text
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }

    void retweet() {
        retweets += 1
    }

    void favorite() {
        favorites += 1
    }

}