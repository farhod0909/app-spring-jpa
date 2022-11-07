package com.example.appspringjpa.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UniversityController {}

//    @Autowired
//    UniversityRepository universityRepository;
//    @Autowired
//    AddressRepository addressRepository;
//
//    @RequestMapping(value = "/university", method = RequestMethod.GET)
//    public List<com.example.appspringjpa.entity.University> getUniversities() {
//        return universityRepository.findAll();
//    }
//
//    @RequestMapping(value = "/create/university", method = RequestMethod.POST)
//    public String create(@RequestBody UniversityDto universityDto) {
//
//        Address address = new Address();
//        address.setCity(universityDto.getCity());
//        address.setDistrict(universityDto.getDistrict());
//        address.setStreet(universityDto.getStreet());
//        Address savedAddress = addressRepository.save(address);
//
//        University universityTable = new University();
//        universityTable.setName(universityDto.getName());
//        universityTable.setAddress(savedAddress);
//        University saved = universityRepository.save(universityTable);
//        universityRepository.save(saved);
//        return "University added";
//    }
//
//
//    @RequestMapping(value = "/deleted/university/{id}", method = RequestMethod.DELETE)
//    public String deletedUniversity(@PathVariable Integer id) {
//        Optional<University> university = universityRepository.findById(id);
//        if (university.isPresent()) {
//            universityRepository.delete(university.get());
//            return "Successfully deleted";
//        } else return "Bunday user malumotlar bazasida topilmadi";
//
//    }
//
//    @RequestMapping(value = "/update/unversity/{id}", method = RequestMethod.PUT)
//    public String updateUniversity(@PathVariable Integer id, @RequestBody UniversityDto universityDto) {
//
//        Optional<University> universityOptional = universityRepository.findById(id);
//        if (universityOptional.isPresent()) {
//            University university = universityOptional.get();
//            university.setName(universityDto.getName());
//            Address address = university.getAddress();
//            address.setStreet(universityDto.getStreet());
//            address.setCity(universityDto.getCity());
//            address.setDistrict(universityDto.getStreet());
//            university.setAddress(address);
//            universityRepository.save(university);
//            return "successfully edited university";
//        }
//        else {
//            return "connot find univedrsity";
//        }
//        }
//
//    }
//
