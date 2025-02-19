package api;

import entity.Users;

public interface Test1Service {
    String test1();

    String test2();

    String test3(Users users);

    String test4_loadBalance();

    Integer test5_testLoadBalanceNum();
}
