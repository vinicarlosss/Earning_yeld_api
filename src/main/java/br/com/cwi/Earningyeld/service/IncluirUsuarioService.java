package br.com.cwi.Earningyeld.service;

import br.com.cwi.Earningyeld.controller.request.IncluirUsuarioRequest;
import br.com.cwi.Earningyeld.controller.response.UsuarioResponse;
import br.com.cwi.Earningyeld.domain.Usuario;
import br.com.cwi.Earningyeld.mapper.IncluirUsuarioMapper;
import br.com.cwi.Earningyeld.repository.UsuarioRepository;
import br.com.cwi.Earningyeld.service.validator.ValidaEmailUnicoService;
import br.com.cwi.Earningyeld.validator.ValidaIncluirUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IncluirUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private ValidaEmailUnicoService validaEmailUnicoService;
    @Autowired
    private ValidaIncluirUsuario validaIncluirUsuario;

    @Transactional
    public UsuarioResponse incluir(IncluirUsuarioRequest request) {

        validaEmailUnicoService.validar(request.getEmail());
        validaIncluirUsuario.validar(request);

        Usuario usuario = IncluirUsuarioMapper.toEntity(request);
        usuario.setSenha(getSenhaCriptografada(request.getSenha()));

        usuarioRepository.save(usuario);

        return IncluirUsuarioMapper.toResponse(usuario);
    }

    private String getSenhaCriptografada(String senhaAberta) {
        return passwordEncoder.encode(senhaAberta);
    }
}
