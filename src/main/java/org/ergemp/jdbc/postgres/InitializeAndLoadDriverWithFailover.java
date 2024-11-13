package org.ergemp.jdbc.postgres;

public class InitializeAndLoadDriverWithFailover {
    public static void main(String[] args){
        //jdbc:postgresql://host1:port1,host2:port2/database
        //

        /*
        For example an application can create two connection pools.
        One data source is for writes, another for reads.
        The write pool limits connections only to master node:

        jdbc:postgresql://node1,node2,node3/accounting?targetServerType=master.
        */

        /*
        And read pool balances connections between slaves nodes,
        but allows connections also to master if no slaves are available:

        jdbc:postgresql://node1,node2,node3/accounting?targetServerType=preferSlave&loadBalanceHosts=true
        */

    }
}
