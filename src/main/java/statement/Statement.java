package statement;

import java.util.ArrayList;
import java.util.List;

public class Statement {

    List<Row> rows;

    private Statement(List<Row> rows) {
        this.rows = rows;
    }

    public static class Builder {

        List<Row> rows = new ArrayList<>();

        public Builder with(Row row) {
            rows.add(row);
            return this;
        }

        public Statement build() {
            return new Statement(rows);
        }
    }
}
