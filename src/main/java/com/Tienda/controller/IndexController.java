package com.Tienda.controller;

import com.Tienda.service.ArticuloService;
import com.Tienda.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se unsa arquitectura MVC");
        
        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        
        return "index";
    }       
 
    
}
 /*String mensaje = "Estamos ne la semana 4, saludos.";
        model.addAttribute("text", mensaje);

        Cliente cliente = new Cliente("Kevin", "Robles", "kevinroblesgambo@gmail.com", "8321 8693");
        model.addAttribute("cliente", cliente);

        Cliente cliente2 = new Cliente("Luis", "Gamboa", "mesaquemasaplauda@gmail.com", "62914726");
        var clientes = Arrays.asList(cliente, cliente2);
        //var clientes = Arrays.asList();*/
