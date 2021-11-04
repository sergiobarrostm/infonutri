package ifal.infonutri;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.lang.Math;
import java.util.Optional;


@org.springframework.stereotype.Controller
public class Controller {
    private Repository infoRepository;

    public Controller(Repository infoRepository){
        this.infoRepository = infoRepository;

    }

    @GetMapping("/")
    public String listarInfo(Model model){
        Iterable<Alimento> alimento = infoRepository.findAll();
        model.addAttribute("alimento", alimento);
        return "index";
    }


    @GetMapping("/novo")
    public String mostrarForm (Model model){
        Alimento alimento = new Alimento();

        model.addAttribute("alimento" , alimento);
        return "formulario";
    }

    @GetMapping("/detalhes")
    public String verDetalhes(Integer id, Model model){
        Alimento alimento = infoRepository.findById(id).get();
        double valorEnergeticoVD = (alimento.getValorEnergetico() / 20);
        double carboidratosVD = (alimento.getProteinas() / 3);
        double proteinasVD = (((alimento.getProteinas() * 100)/ 75));
        double gordurasTotaisVD = ((alimento.getGordurasTotais() * 100)/ 55);
        double gordurasSaturadasVD = ((alimento.getGordurasSaturadas() * 100) / 22 );
        double fibraAlimentarVD = ((alimento.getFibraAlimentar() * 100) / 25);
        double sodioVD = (alimento.getSodio() / 24 );

        model.addAttribute("valorEnerticoVD" , Math.round(valorEnergeticoVD));
        model.addAttribute("carboidratosVD" , Math.round(carboidratosVD));
        model.addAttribute("proteinasVD" ,Math.round(proteinasVD));
        model.addAttribute("gordurasTotaisVD" , Math.round(gordurasTotaisVD));
        model.addAttribute("gordurasSaturadasVD" , Math.round(gordurasSaturadasVD));
        model.addAttribute("fibraAlimentarVD" , Math.round(fibraAlimentarVD));
        model.addAttribute("sodioVD" , Math.round(sodioVD));
        model .addAttribute("alimento", alimento);
        return "exibir-completo";
    }


    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Alimento alimento){
        infoRepository.save(alimento);
        return "redirect:/";
    }

    @GetMapping("/remover")
    public String excluir (Integer id){
        infoRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/editar")
    public String editar(Integer id, Model model){
        Optional<Alimento> alimento = infoRepository.findById(id);
        model.addAttribute("alimento", alimento);
        return "formulario";
    }


}
