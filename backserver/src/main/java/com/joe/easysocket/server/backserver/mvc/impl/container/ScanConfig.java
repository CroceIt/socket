package com.joe.easysocket.server.backserver.mvc.impl.container;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.joe.easysocket.server.backserver.mvc.container.Provider;
import com.joe.easysocket.server.backserver.mvc.impl.resource.annotation.Path;

/**
 * spring扫描配置
 *
 * @author joe
 * @version 2018.06.25 10:55
 */
class ScanConfig {
    final static List<Class<? extends Annotation>> SOCKET_COMPONENT;
    static {
        List<Class<? extends Annotation>> temp = new ArrayList<>();
        temp.add(Provider.class);
        temp.add(Path.class);
        SOCKET_COMPONENT = Collections.unmodifiableList(temp);
    }
}
