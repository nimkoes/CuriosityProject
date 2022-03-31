package me.xxxelppa.mongoIndex;

public class MongoIndex {

    private static final String[] COLUMN = new String[]{"docName", "cnsltnReqNo", "regDtm"};
    private static final String CLASS_NAME = "CommonDocDocument.class";

    public static void main(String[] args) {

        String index = "new CompoundIndexDefinition(new Document().append(\"docName\", 1).append(\"cnsltnReqNo\", 1).append(\"regDtm\", 1))";
        String mongo = "mongoTemplate.indexOps(" + CLASS_NAME + ").ensureIndex(index)";

        int size = COLUMN.length;
        boolean up_down[] = new boolean[size];

    }

    public int getUpDownInteger(boolean elem) {
        if (elem) {
            return 1;
        } else {
            return -1;
        }
    }
}
