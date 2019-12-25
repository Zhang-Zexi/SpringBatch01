package com.zzx.processor;

import com.zzx.dto.DeviceCommand;
import org.springframework.batch.item.ItemProcessor;

/**
 * @ClassName HelloItemProcessor
 * @Description 读完数据后，我们就需要处理数据了。
 * 既然我们前面从文件里读取了待下发的命令，那么在这里下发命令给设备是最好的时机
 * @Author zhangzx
 * @Date 2019/12/25 17:49
 * Version 1.0
 **/
public class HelloItemProcessor implements ItemProcessor<DeviceCommand, DeviceCommand> {

    @Override
    public DeviceCommand process(DeviceCommand deviceCommand) throws Exception {

        // 模拟下发命令给设备
        System.out.println("send command to device, id=" + deviceCommand.getId());

        // 更新命令状态
        deviceCommand.setStatus("SENT");

        // 返回命令对象
        return deviceCommand;

    }

}
