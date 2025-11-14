package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.entity.Company;
import peaksoft.service.CompanyService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("companies")
public class CompanyController {

    private  final CompanyService companyService;

    @GetMapping
    public String getAllCompanies(Model model){
        model.addAttribute("allCompanies" ,companyService.getAllCompanies());
        return "mainPage";
    }

    @GetMapping("/new")
    public String createCompany(Model model){
        model.addAttribute("company",new Company());
        return "newCompany";
    }

    @PostMapping("/save")
    public String saveCompany(@ModelAttribute("company") Company company){
        companyService.addCompany(company);
        return "redirect:/companies";
    }

    @GetMapping("/{id}/delete")
    public String deleteCompany(@PathVariable("id")Long id){
        companyService.deleteCompany(id);
        return "redirect:/companies";
    }

}
