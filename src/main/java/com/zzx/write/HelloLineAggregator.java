package com.zzx.write;

import com.zzx.dto.DeviceCommand;
import org.springframework.batch.item.file.transform.LineAggregator;

/**
 * @ClassName HelloLineAggregator
 * @Description 处理完数据后，我们需要更新命令状态到文件里，用于记录我们已经下发。
 * @Author zhangzx
 * @Date 2019/12/25 17:52
 * Version 1.0
 **/
public class HelloLineAggregator implements LineAggregator<DeviceCommand> {

    @Override
    public String aggregate(DeviceCommand deviceCommand) {

        StringBuffer sb = new StringBuffer();
        sb.append(deviceCommand.getId());
        sb.append(",");
        sb.append(deviceCommand.getStatus());
        return sb.toString();

    }

}