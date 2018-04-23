package com.poseidon.micro.enums;

/**
 * Created by pczhangyu on 2018/4/23.
 */
public enum IndexTypeEnum {

    /**
     * 索引名称与类型
     */
    APE_AREA_CUSTOMER("ape_area","customer"),
    APE_AREA_LAVING_MESSAGE("ape_area","leaving_message");

    public static final String INDEX_NAME = "ape_area";
    public static final String INDEX_TYPE_CUSTOMER = "customer";

    private String IndexName;

    private String IndexType;

    IndexTypeEnum(String indexName, String indexType) {
        this.IndexName = indexName;
        this.IndexType = indexType;
    }

    public String getIndexName() {
        return IndexName;
    }

    public void setIndexName(String indexName) {
        IndexName = indexName;
    }

    public String getIndexType() {
        return IndexType;
    }

    public void setIndexType(String indexType) {
        IndexType = indexType;
    }

    public static void main(String[] args) {
        System.out.println(IndexTypeEnum.APE_AREA_LAVING_MESSAGE.getIndexType());
    }
}


