package com.mingu.adminpage.controller.api;

import com.mingu.adminpage.controller.CrudController;
import com.mingu.adminpage.model.entity.User;
import com.mingu.adminpage.model.network.request.UserApiRequest;
import com.mingu.adminpage.model.network.response.UserApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {

}
