package com.example.conc;

import com.example.abst.MessageBuilder;

public class EmailMessage {
    private String sender;
    private String[] recipients;
    private String subject;
    private String body;

    public EmailMessage(String sender, String[] recipients, String subject, String body) {
        this.sender = sender;
        this.recipients = recipients;
        this.subject = subject;
        this.body = body;
    }
    public String getSender() {
        return sender;
    }
    public String[] getRecipients() {
        return recipients;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
    public  static class EmailMessageBuilder implements MessageBuilder<EmailMessage>
    {
        private String sender;
        private String[] recipients;
        private String subject;
        private String body;

        @Override
        public MessageBuilder<EmailMessage> from(String sender) {
            this.sender=sender;
            return this;
        }

        @Override
        public MessageBuilder<EmailMessage> to(String[] recipients) {
            this.recipients=recipients;
            return this;
        }

        @Override
        public MessageBuilder<EmailMessage> subject(String subject) {
            this.subject=subject;
            return this;
        }

        @Override
        public MessageBuilder<EmailMessage> body(String body) {
            this.body=body;
            return this;
        }

        @Override
        public EmailMessage build() {

            return new EmailMessage(sender,recipients,subject,body);
        }


    }

    public  static  class  EmailDirector{
        private  MessageBuilder<EmailMessage> builder;

        public EmailDirector(MessageBuilder<EmailMessage> builder)
        {
            this.builder=builder;
        }

        public void sendEmail(){
            EmailMessage email= builder
                    .from("user@exaple.com")
                    .to(new String[]{"test@example.com","test2@example.com"})
                    .subject("Test Email")
                    .body("This is a test email")
                    .build();
            EmailSender.sendEmail(email);
        }
        public static class EmailSender {
            public static void sendEmail(EmailMessage email) {
                // Code to send the email
                System.out.println("Email sent from " + email.getSender() + " to " + String.join(",", email.getRecipients()) + ":");
                System.out.println("Subject: " + email.getSubject());
                System.out.println("Body: " + email.getBody());
            }
        }
    }

}
