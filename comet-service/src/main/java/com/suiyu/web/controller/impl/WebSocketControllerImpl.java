package com.suiyu.web.controller.impl;

import com.suiyu.web.controller.WebSocketController;
import com.suiyu.web.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yinbing on 1/22/2016.
 */
@Controller
@RequestMapping(value = "/")
public class WebSocketControllerImpl implements WebSocketController {
    @Autowired
    private WebSocketService webSocketService;
    @Override
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void subscribe(HttpServletRequest request) throws Exception {

    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void broadcastMessage(HttpServletRequest request) throws Exception {

    }

    @Override
    @RequestMapping(value = "{clientId:\\d+}", method = RequestMethod.GET)
    @ResponseBody
    public void subscribeClient(HttpServletRequest request) {

    }

    @Override
    @RequestMapping(value = "{clientId:\\d+}", method = RequestMethod.POST)
    @ResponseBody
    public void broadcastClientMessage(HttpServletRequest request) {

    }
}
