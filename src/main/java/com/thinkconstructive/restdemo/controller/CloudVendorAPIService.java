package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    @GetMapping("{VendorId}")
    public CloudVendor getCloudVendorDetails(String VendorId)
    {
        return  cloudVendor;

       // return new CloudVendor("C1","Vendor 1", "Address one","xxxx");
    }

    @PostMapping
    public  String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public  String UpdateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping ("{vendorId}")
    public  String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully";
    }
}
