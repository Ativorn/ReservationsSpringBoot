package be.iccbxl.pid.restModel;

import lombok.Data;

import java.util.List;

@Data
public class Results {

    private List<be.iccbxl.pid.restModel.Event> event;
}
