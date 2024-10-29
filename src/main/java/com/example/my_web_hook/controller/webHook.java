package com.example.my_web_hook.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my_web_hook.dto.ZaloRequest;

@RestController
@RequestMapping("/webhook")
public class webHook {
	
	@PostMapping("/revoke")
	public String receiveUserRevoke(@RequestBody ZaloRequest request) {
		System.out.println(request.toString());
		return "receive Data" + request.getAppId();
	}

}
