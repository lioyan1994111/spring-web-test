#!/bin/bash

JVM_PRO="-Xms256m -Xmx512m"
ROOT_DIR="/work/service_test"
APP_NAME=blog-web.jar
NOW_DATE=$(date +%c)

usage() {
    echo "用法: sh service_test.sh [start(启动)|stop(停止)|restart(重启)|status(状态)|log(实时监控日志)]"
    exit 1
}

cd ${ROOT_DIR}

echo "当前时间：${NOW_DATE}"

is_exist(){
  pid=`ps -ef|grep ${APP_NAME}|grep -v grep|awk '{print $2}' `
  if [[ -z "${pid}" ]]; then
   return 1
  else
    return 0
  fi
}

start(){
  is_exist
  if [[ $? -eq "0" ]]; then
    echo "${APP_NAME} 正在运行。 pid=${pid} ."
  else
    nohup java ${JVM_PRO}  -jar ${ROOT_DIR}/${APP_NAME}  > ${ROOT_DIR}/log.out  2>&1 &
    echo "${APP_NAME}启动成功，请查看日志确保运行正常。"
    fi
}

stop(){
  is_exist
  if [[ $? -eq "0" ]]; then
    kill -9 $pid
    echo "${pid} 进程已被杀死，程序停止运行"
  else
    echo "${APP_NAME} 未运行！"
  fi
}

status(){
  is_exist
  if [[ $? -eq "0" ]]; then
    echo "${APP_NAME} 正在运行。Pid is ${pid}"
  else
    echo "${APP_NAME} 未运行！"
  fi
}

log(){
  echo "日志文件位置：${ROOT_DIR}/log.out"
  tail -f ${ROOT_DIR}/log.out
}

restart(){
  stop
  start
  log
}

case "$1" in
  "start")
    start
    ;;
  "stop")
    stop
    ;;
  "status")
    status
    ;;
  "restart")
    restart
    ;;
  "log")
    log
    ;;
  *)
    usage
    ;;
esac
