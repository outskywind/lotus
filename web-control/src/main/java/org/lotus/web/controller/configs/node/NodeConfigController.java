package org.lotus.web.controller.configs.node;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/config/node")
public class NodeConfigController {

    /**
     * 用户输入机器IP ，校验IP能够联通之后
     * 然后部署对应的 agent 到 机器上 ssh 启动agent
     * agent 心跳连接之后校验合格，注册到zk
     * /lotus/nodes
     * /lotus/service
     *                       ---/serviceName/nodeIp
     * @param nodeIp
     * @return
     */
    public String addServerNode(String nodeIp){
        return  "";
    }

}
