package com.example.demo;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;

@Path("/addUpNumbers")
public class HelloResource {
    @Inject
    SummaryService summaryService;

    @Inject
    MessageService messageService;


    @GET
    @Path("/input")
    @Produces(MediaType.APPLICATION_JSON)

    public int[] addMessage() {

        return messageService.getAllMessages();

    }


    @GET
    @Path("/output")
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, Integer> integerList() {
        return summaryService.get_Test();
    }


}