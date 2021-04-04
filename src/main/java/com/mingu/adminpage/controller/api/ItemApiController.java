package com.mingu.adminpage.controller.api;

import com.mingu.adminpage.controller.CrudController;
import com.mingu.adminpage.model.entity.Item;
import com.mingu.adminpage.model.network.request.ItemApiRequest;
import com.mingu.adminpage.model.network.response.ItemApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {

}
