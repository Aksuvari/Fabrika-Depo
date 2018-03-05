/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author numan
 */
public class email {
     	static Properties mailServerProperties;
	static Session getMailSession;
	static MimeMessage generateMailMessage;
    public void Email(String adres,String isim,String Soyisim,String pass) throws AddressException, MessagingException{
        
		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
	
		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(adres));
		generateMailMessage.setSubject("Numan OKUR");
		String emailBody = isim+Soyisim+ "<br><br> Sifreniz, <br> "+pass;
		generateMailMessage.setContent(emailBody, "text/html");
		
		Transport transport = getMailSession.getTransport("smtp");
 
		transport.connect("smtp.gmail.com", "nmnokr46@gmail.com", "1704Numan.");
		transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
		transport.close();
    }
}
