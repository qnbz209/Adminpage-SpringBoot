package com.mingu.adminpage.controller.api;

import com.mingu.adminpage.ifs.CrudInterface;
import com.mingu.adminpage.model.network.Header;
import com.mingu.adminpage.model.network.request.OrderGroupApiRequest;
import com.mingu.adminpage.model.network.response.OrderGroupApiResponse;
import com.mingu.adminpage.service.OrderGroupApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController implements CrudInterface<OrderGroupApiRequest, OrderGroupApiResponse> {

    @Autowired
    private OrderGroupApiLogicService orderGroupApiLogicService;

    @Override
    @PostMapping("")
    public Header<OrderGroupApiResponse> create(Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<OrderGroupApiResponse> read(Long id) {
        return orderGroupApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<OrderGroupApiResponse> update(Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<OrderGroupApiResponse> delete(Long id) {
        return orderGroupApiLogicService.delete(id);
    }
}
