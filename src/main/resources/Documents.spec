Name: spring-test
Version: v.1.0.18
Release: 1%{?dist}
Summary: 测试打包，以springboot项目为测试用例


License：
URL: www.lioyan.com
Source0: spring-web-test-v1.0.18.jar
AutoReqProv: no

%description
测试


%install
cp %{_buildrootdir}/spring-web-test-v1.0.18.jar /work/spring-web
cp %{_buildrootdir}/spring-web-test.sh /etc/rc.d/init.d



%post
service spring-web start

%preun                    #rpm卸载前执行的脚本
service spring-web stop

%postun

rm -rf /work/spring-web
rm -rf /etc/rc.d/init.d/spring-web-test.sh