package com.zzx.read;

import com.zzx.dto.DeviceCommand;
import org.springframework.batch.item.file.LineMapper;

/**
 * @ClassName HelloLineMapper
 * @Description 一个LineMapper实现类，
 * 用于将batch-data-source.csv文件的每行数据，转成程序方便处理的DeviceCommand对象。
 * @Author zhangzx
 * @Date 2019/12/25 17:45
 * Version 1.0
 **/
public class HelloLineMapper implements LineMapper<DeviceCommand> {

    @Override
    public DeviceCommand mapLine(String line, int lineNumber) throws Exception {

        // 逗号分割每一行数据
        String[] args = line.split(",");

        // 创建DeviceCommand对象
        DeviceCommand deviceCommand = new DeviceCommand();

        // 设置id值到对象中
        deviceCommand.setId(args[0]);

        // 设置status值到对象中
        deviceCommand.setStatus(args[1]);

        // 返回对象
        return deviceCommand;

    }

}
