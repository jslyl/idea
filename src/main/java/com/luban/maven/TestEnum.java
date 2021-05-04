package com.luban.maven;

public enum TestEnum {
    A,
    B;
    public String getEnumByName(String name){

        switch(name){
            case "2":
                return "测试A啊";
            case "22":
                return "测试B啊";
            default:
                return "Unknow Day";
        }
    }

    public static void main(String[] args) {
        TestEnum.valueOf("2");

    }
}
