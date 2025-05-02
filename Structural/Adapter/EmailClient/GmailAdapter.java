package Structural.Adapter.EmailClient;

import Structural.Adapter.EmailClient.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmail = new GmailClient();
    // private GmailClient gmail;

    // public GmailAdapter(GmailClient gmail) {
    //     this.gmail = gmail;
    // }

    @Override
    public void downloadEmails() {
gmail.connect();
gmail.getEmails();
gmail.disconnect();
    }
    
}
