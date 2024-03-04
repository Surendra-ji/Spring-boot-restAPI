package com.restAPI.rest.api.controller;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.rest.api.model.CloudVendor;

@RestController
@RequestMapping("/cloudevendor")
public class CloudVendorAPIService {
    CloudVendor cloudeVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudeVendor;
        // return new CloudVendor("C1", "Vendor 1", "add vendor one", "90xxxxxxxx");
    }

    @PostMapping
    public String createCloudeVendorDetails(@RequestBody CloudVendor cloudeVendor){
        this.cloudeVendor = cloudeVendor;
        return "Cloude vendor created successfully";
    }

    @PutMapping
    public String updateCloudeVendorDetails(@RequestBody CloudVendor cloudeVendor){
        this.cloudeVendor = cloudeVendor;
        return "Cloude vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudeVendorDetails(String vendorId){
        this.cloudeVendor = null;
        return "Cloude vendor deleted successfully";
    }

}
