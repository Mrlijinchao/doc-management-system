# 该镜像需要依赖的基础镜像
FROM openjdk:8-jre-alpine

# 指定维护者的名字
MAINTAINER lijinchao 2116639781@qq.com

# 在docker中添加fontconfig 和 字体
# 该过程比较慢，可以参考https://lhalcyon.com/alpine-font-issue/
ENV LANG en_US.UTF-8RUN apk add --update ttf-dejavu fontconfig && rm -rf /var/cache/apk/*

ARG APP_NAME
ENV APP_NAME=$APP_NAME
ENV HOME_PATH /usr/local
ADD ./$APP_NAME/server-package/*.jar $HOME_PATH/app.jar
WORKDIR $HOME_PATH/$APP_NAME
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-jar","/usr/local/app.jar"]
