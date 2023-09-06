package io.github.com.picpaysimples.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.com.picpaysimples.domain.user.User;
import io.github.com.picpaysimples.dtos.NotificationDTO;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        // NotificationDTO notification = new NotificationDTO(email, message);
        // ResponseEntity<String> response = restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notification,
        //         String.class);
        // if (!(response.getStatusCode() == HttpStatus.OK)) {
        //     throw new Exception("Erro ao enviar notificação");
        // }

        System.out.println("Notificação enviada com sucesso" + email);
    }

}
