package clase12.clase_12.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import clase12.clase_12.Controllers.Services.CancionService;

@Controller
public class CancionController {
    
    @Autowired
    CancionService cancionService;
}
