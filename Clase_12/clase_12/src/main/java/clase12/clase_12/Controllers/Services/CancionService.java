package clase12.clase_12.Controllers.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clase12.clase_12.Controllers.Repositories.CancionRepository;

@Service
public class CancionService {
    
    @Autowired
    CancionRepository cancionRepo;
}
