package HM.server.server;


import com.fasterxml.jackson.databind.util.ObjectBuffer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class ServerController {

    @PostMapping(path="/server/json")
    public String serverRequest(@RequestBody HashMap<String, Object> param){
        System.out.println("param: " + param);
        return param.toString();
    }
}
