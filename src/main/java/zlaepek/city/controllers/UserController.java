package zlaepek.city.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zlaepek.city.dto.UserListResponseDto;
import zlaepek.city.dto.UserRequestDto;
import zlaepek.city.services.UserService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@ResponseBody
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private final UserService userService;

    /*
    @PostMapping
    public Long createUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }
    */
    @GetMapping("")
    public List<UserListResponseDto> findAllCard() {
        return userService.findAll();
    }



}

