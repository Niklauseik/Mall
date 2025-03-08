package ltd.user.cloud.newbee.controller.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class BatchIdParam implements Serializable {
    Long[] ids;
}
