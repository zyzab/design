package com.zyz.design.mediator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by zyz on 17/3/11.
 */
public class DepUserMediatorImpl {

    private static DepUserMediatorImpl mediator = new DepUserMediatorImpl();

    private DepUserMediatorImpl(){
        initTestData();
    }

    public static DepUserMediatorImpl getInstance(){
        return mediator;
    }

    private Collection<DepUserModel> depUserModels =
            new ArrayList<DepUserModel>();

    /**
     * 撤销部门
     * @param depId
     * @return
     */
    public boolean deleteDep(String depId){
        Collection<DepUserModel> deleteCol =
                new ArrayList<DepUserModel>();
        for (DepUserModel du : depUserModels){
            if(du.getDepId().equals(depId)){
                deleteCol.add(du);
            }
        }
        depUserModels.removeAll(deleteCol);
        return true;
    }

    /**
     * 删除人员
     * @param userId
     * @return
     */
    public boolean deleteUser(String userId){
        Collection<DepUserModel> deleteCol =
                new ArrayList<DepUserModel>();
        for (DepUserModel du : depUserModels){
            if(du.getUserId().equals(userId)){
                deleteCol.add(du);
            }
        }
        depUserModels.removeAll(deleteCol);
        return true;
    }

    /**
     * 打印该部门下的所有人员
     * @param dep
     */
    public void showDepUsers(Dep dep){
        for(DepUserModel du : depUserModels){
            if(du.getDepId().equals(dep.getDepId())){
                System.out.println("部门编号 = [" + du.getDepId() + "] 下面拥有人员,其编号 = ["+du.getUserId() +"]");
            }
        }
    }

    /**
     * 打印该人员对应的部门
     * @param user
     */
    public void showUserDeps(User user){
        for (DepUserModel du : depUserModels){
            if(du.getUserId().equals(user.getUserId())){
                System.out.println("人员编号 = [" + du.getUserId() + "] ,属于部门编号 = ["+du.getDepId() +"]");
            }
        }
    }


    private void initTestData(){
        DepUserModel du1 = new DepUserModel();
        du1.setDepId("d1");
        du1.setDepUserId("u1");
        du1.setDepUserId("du1");
        depUserModels.add(du1);

        DepUserModel du2 = new DepUserModel();
        du2.setDepId("d2");
        du2.setDepUserId("u2");
        du2.setDepUserId("du2");
        depUserModels.add(du2);

        DepUserModel du3 = new DepUserModel();
        du3.setDepId("d3");
        du3.setDepUserId("u3");
        du3.setDepUserId("du3");
        depUserModels.add(du3);

        DepUserModel du4 = new DepUserModel();
        du4.setDepId("d4");
        du4.setDepUserId("u4");
        du4.setDepUserId("du4");
        depUserModels.add(du4);

        DepUserModel du5 = new DepUserModel();
        du5.setDepId("d5");
        du5.setDepUserId("u5");
        du5.setDepUserId("du5");
        depUserModels.add(du5);
    }

}
