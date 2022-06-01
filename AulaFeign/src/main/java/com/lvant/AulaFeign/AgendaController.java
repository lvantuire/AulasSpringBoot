package com.lvant.AulaFeign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

        public Contato retornaContato() {
            return Contato.builder()
                    .id(1L)
                    .nome("Vantuir")
                    .telefone("999-9999")
                    .build();
        }
}
