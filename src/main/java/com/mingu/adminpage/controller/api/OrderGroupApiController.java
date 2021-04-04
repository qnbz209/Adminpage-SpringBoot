package com.mingu.adminpage.controller.api;

import com.mingu.adminpage.controller.CrudController;
import com.mingu.adminpage.model.entity.OrderGroup;
import com.mingu.adminpage.model.network.request.OrderGroupApiRequest;
import com.mingu.adminpage.model.network.response.OrderGroupApiResponse;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse, OrderGroup> {

}
