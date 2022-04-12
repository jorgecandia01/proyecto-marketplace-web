package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {

    @PostMapping("save-email")
    @ResponseBody
    public String sendEmail(@RequestParam (name="name") String name, 
                            @RequestParam (name="email") String email, 
                            @RequestParam (name="phone") String phone,
                            @RequestParam (name="message") String message){

        return "<html>"+
                    "<head> <title= 'Acciona - Respuesta contacto'><head>"+
                    "<body align='center' style='background-color:grey'>"+
                        "<h3> MENSAJE ENVIADO </h3>"+
                        "<p> Muchas gracias por el mensaje, te contestamos dentro de una semana</p>"+
                        "<p> Aqui un recapitulo</p>"+
                        "<p> Name : "+ name+"</p>"+
                        "<p> Email : "+ email+"</p>"+
                        "<p> Telefono : "+ phone+"</p>"+
                        "<p> Mensaje : "+ message+"</p>"+
                        "<button> <a href='index.html'>Volver al inicio </a></button>"+
                    "</body>"+
                "</html>";
    }
    
}
