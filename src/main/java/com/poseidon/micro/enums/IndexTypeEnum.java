package com.poseidon.micro.enums;

/**
 * @author pczhangyu
 * @date 2018/4/23
 * @description 索引信息
 */
public enum IndexTypeEnum {

    /**
     * 索引名称与类型
     */
    APE_AREA_CUSTOMER("ape_area","customer"),
    APE_AREA_LAVING_MESSAGE("ape_area","leaving_message");

    public static final String INDEX_NAME = "ape_area";
    public static final String INDEX_TYPE_CUSTOMER = "customer";

    private String indexName;

    private String indexType;

    IndexTypeEnum(String indexName, String indexType) {
        this.indexName = indexName;
        this.indexType = indexType;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        indexName = indexName;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        indexType = indexType;
    }

    public static void main(String[] args) {
        System.out.println(IndexTypeEnum.APE_AREA_LAVING_MESSAGE.getIndexType());
    }
}


