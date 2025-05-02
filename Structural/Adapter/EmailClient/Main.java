package Structural.Adapter.EmailClient;

import Structural.Adapter.EmailClient.Gmail.GmailClient;

public class Main {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
