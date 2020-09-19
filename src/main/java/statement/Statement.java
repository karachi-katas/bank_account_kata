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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Statement statement = (Statement) o;

        return rows.equals(statement.rows);
    }

    @Override
    public int hashCode() {
        return rows.hashCode();
    }
}
