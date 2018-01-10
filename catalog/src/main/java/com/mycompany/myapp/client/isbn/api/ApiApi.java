package com.mycompany.myapp.client.isbn.api;

import com.mycompany.myapp.client.isbn.model.ProfileInfoVM;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-01-10T11:10:32.623+01:00")

@Api(value = "api", description = "the api API")
public interface ApiApi {

    @ApiOperation(value = "generateIsbnNumber", notes = "", response = String.class, tags={ "isbn-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/api/isbn",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<String> generateIsbnNumberUsingGET();


    @ApiOperation(value = "getActiveProfiles", notes = "", response = ProfileInfoVM.class, tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoVM.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProfileInfoVM.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProfileInfoVM.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProfileInfoVM.class) })
    @RequestMapping(value = "/api/profile-info",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ProfileInfoVM> getActiveProfilesUsingGET();

}
