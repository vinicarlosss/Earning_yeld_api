package br.com.cwi.Earningyeld.service;

import br.com.cwi.Earningyeld.controller.request.GerarTokenRequest;
import br.com.cwi.Earningyeld.domain.Usuario;
import br.com.cwi.Earningyeld.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.mail.MessagingException;
import java.util.Optional;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class GerarTokenService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UserPasswordService userPasswordService;
    @Autowired
    private EmailService emailService;

    public void gerar(GerarTokenRequest request) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByEmail(request.getEmail());
        if(optionalUsuario.isPresent()){
            optionalUsuario.ifPresent(user ->{
                String token = userPasswordService.generateToken(user);
                String content = emailService. getContent(token);
                try{
                    emailService.sendEmailToClient("Alteração de senha", request.getEmail(), content);
                }catch (MessagingException e){
                    throw new ResponseStatusException(BAD_REQUEST, "Não foi possível enviar o email");
                }
            });
        }else{
            throw new ResponseStatusException(BAD_REQUEST, "Email não encontrado");
        }
    }
}
