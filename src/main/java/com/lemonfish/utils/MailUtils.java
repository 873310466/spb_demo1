package com.lemonfish.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author Masics 张超
 * @mail 873310466@qq.com
 * @date 2020/2/5 14:56
 */
@Service
public class MailUtils {
    @Autowired
     JavaMailSenderImpl mailSender;


    /**
     * 发送邮件
     * @param from  发件人
     * @param to    接收人
     * @param subject   邮件主题
     * @param text  邮件正文
     * @param attachmentFileName    附件名字
     * @param attachment    附件
     * @param html  是否解析html 标签
     * @throws MessagingException
     */
    public  void sendMail(String from, String to, String subject, String text, String attachmentFileName, File attachment, Boolean html) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        // 组转
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        // 正文
        helper.setSubject(subject);
        helper.setText(text, html);
        helper.setFrom(from);
        helper.setTo(from);

        // 附件
        if (attachment != null && attachmentFileName != null && attachmentFileName.length() > 0) {
            helper.addAttachment(attachmentFileName,attachment );
        }

        mailSender.send(mimeMessage);
    }


    public void sendMail(String from, String to, String subject, String text,  Boolean html) throws MessagingException {
        sendMail(from,to,subject,text,null,null,html);
    }

    /**
     * 发送邮件（自己用）---包括附件
     * @param to
     * @param subject
     * @param text
     * @param attachmentName
     * @param attachment
     * @throws MessagingException
     */
    public  void sendMail(String to, String subject, String text, String attachmentName, File attachment) throws MessagingException {
        sendMail("873310466@qq.com",to,subject,text,attachmentName,attachment,true);
    }

    /**
     * 发送邮件（自己用）---包括附件
     * @param to
     * @param subject
     * @param text
     * @throws MessagingException
     */
    public void sendMail( String to, String subject, String text) throws MessagingException {
        sendMail("873310466@qq.com",to,subject,text,null,null,true);
    }

}
