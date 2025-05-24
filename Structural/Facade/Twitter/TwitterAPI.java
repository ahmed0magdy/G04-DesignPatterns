package Structural.Facade.Twitter;

import java.util.List;

public class TwitterAPI {
    private String appkey;
    private String secret;

    public TwitterAPI(String appkey, String secret) {
        this.appkey = appkey;
        this.secret = secret;
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);
        return accessToken;

    }

    public List<Tweet> getRecentTweets() {
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(getAccessToken());
        return tweets;

    }
}
