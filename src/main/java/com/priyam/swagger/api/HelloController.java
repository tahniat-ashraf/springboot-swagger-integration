package com.priyam.swagger.api;

import com.priyam.swagger.request.MyRequest;
import com.priyam.swagger.response.MyResponse;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by dni_tahniat on 3/14/2018.
 */

@RestController
@RequestMapping("/swagger")
@Api(value="swagger", description="Sample swagger-boot implementation")
public class HelloController {

    Logger logger=Logger.getLogger(HelloController.class.getName());

    @ApiOperation(value = "Get Sample response for sample requestBody",response = MyResponse.class,produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved sample response"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = "application/json")
    public MyResponse test(@ApiParam(value = "Sample request body for test class", required = true) @RequestBody MyRequest myRequest) {
        logger.info("=> test() with name :: "+myRequest.getName()+" ; id :: "+myRequest.getId());
        MyResponse myResponse=new MyResponse();

        if(myRequest.getId()==1 && myRequest.getName().compareTo("X")==0){
            myResponse.setStatusCode("0000");
        }else{
            myResponse.setStatusCode("9999");
        }

        logger.info("<= test() with statusCode :: "+myResponse.getStatusCode());
        return myResponse;
    }

}
