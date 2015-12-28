package org.yanlz.blog.jooq.extra;

import org.jooq.tools.StringUtils;
import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

/**
 * @author liangzhao.yan  Date: 9/25/15 Time: 18:19
 */
public class GeneratorStrategy extends DefaultGeneratorStrategy {
    private String tablePrefix = "tb_";

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        StringBuilder result = new StringBuilder();

        String outputName = definition.getOutputName();
        if (!StringUtils.isBlank(tablePrefix) && outputName.startsWith(tablePrefix)) {
            outputName = outputName.substring(tablePrefix.length());
        }
        result.append(StringUtils.toCamelCase(outputName));

        if (mode == Mode.RECORD) {
            result.append("Record");
        } else if (mode == Mode.DAO) {
            result.append("Dao");
        } else if (mode == Mode.INTERFACE) {
            result.insert(0, "I");
        }
        return result.toString();
    }
}
