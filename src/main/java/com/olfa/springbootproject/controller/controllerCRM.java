package com.olfa.springbootproject.controller;
import com.olfa.springbootproject.exception.ResourceNotFoundException;
import com.olfa.springbootproject.model.modelCRM;
import com.olfa.springbootproject.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class controllerCRM {

    @Autowired
    private repository repositoryCRM ;

    @GetMapping("/client")
    public List<modelCRM> getAllclient() {
        return repositoryCRM.findAll();
    }

    //getclientbyid
    @GetMapping("/client")
    @PutMapping("/client/{id}")
    public ResponseEntity<modelCRM> getclientbyid(@PathVariable(value = "id") Long clientid, @RequestBody modelCRM clientDetails) throws ResourceNotFoundException {
        modelCRM client;
        client = repositoryCRM.findById(clientid)
                .orElseThrow(() -> new ResourceNotFoundException("client not found for this id :: " + clientid));
        return ResponseEntity.ok().body(client);

    }
    //saveclient
    @PostMapping("/client")
    public modelCRM createclient( @RequestBody modelCRM client) {
        return repositoryCRM.save(client);
    }
    //updateclient
    @PutMapping("/client/{id}")
    public ResponseEntity<modelCRM> updateclient(@PathVariable(value = "id") Long clientid, @RequestBody modelCRM clientDetails) throws ResourceNotFoundException {
       modelCRM client = repositoryCRM.findById(clientid)
               .orElseThrow(() -> new ResourceNotFoundException("client not found for this id :: " + clientid));
        client.setPrenom(clientDetails.getPrenom());
        client.setNom(clientDetails.getNom());
        final modelCRM updatedclient = repositoryCRM.save(client);
        return ResponseEntity.ok(updatedclient);
    }
    //deleteclient
    @DeleteMapping("/client/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long clientid)
            throws ResourceNotFoundException {
        modelCRM client = repositoryCRM.findById(clientid)
                .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + clientid));

        repositoryCRM.delete(client);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}






